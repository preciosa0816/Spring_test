package org.zerock.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.authentication.rememberme.JdbcTokenRepositoryImpl;
import org.springframework.security.web.authentication.rememberme.PersistentTokenRepository;
import org.springframework.security.web.csrf.CsrfFilter;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.zerock.security.CustomLoginSuccessHandler;
import org.zerock.security.CustomerUserDetailsService;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Log4j
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Setter(onMethod_ = { @Autowired })
	private DataSource dataSource;

	@Bean // 커스텀 UserDetilasService설정
	public UserDetailsService customUserService() {
		return new CustomerUserDetailsService();
	}

	// UserDetailsService : // in custom userdetails
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(customUserService()).passwordEncoder(passwordEncoder());
	}

	@Bean // 로그인이 성공하는 경우의 처리
	public AuthenticationSuccessHandler loginSuccessHandler() {
		return new CustomLoginSuccessHandler();
	}

	@Override
	public void configure(HttpSecurity http) throws Exception {
		CharacterEncodingFilter filter = new CharacterEncodingFilter();
		filter.setEncoding("UTF-8");
		filter.setForceEncoding(true);
		http.addFilterBefore(filter, CsrfFilter.class);

		http.authorizeRequests().antMatchers("sample/all").permitAll().antMatchers("/sample/admin")
				.access("hasRole('ROLE_ADMIN')").antMatchers("/sample/member").access("hasRole('ROLE_MEMBER')");

		http.formLogin().loginPage("/customLogin").loginProcessingUrl("/login").successHandler(loginSuccessHandler());

		http.logout().logoutUrl("/customLogout").invalidateHttpSession(true).deleteCookies("remember-me",
				"JSESSION_ID");

		http.rememberMe().key("zerock").tokenRepository(persistentTokenRepository()).tokenValiditySeconds(604800);
	}

	@Bean // remember-me를 위한 설정
	public PersistentTokenRepository persistentTokenRepository() {
		JdbcTokenRepositoryImpl repo = new JdbcTokenRepositoryImpl();
		repo.setDataSource(dataSource);
		return repo;
	}

	@Bean // XML에서 CustomNoOpPasswordEncoder랑 동일
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

//	@Override
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception{
//		log.info("configure..............................");
//		auth.inMemoryAuthentication().withUser("admin").password("{noop}admin").roles("ADMIN");
//		
//		//passwordEncoderTests에서 얻어온 member의 pw인코드 값
//		//$2a$10$tDDBbv/wuLZDQHsSeWgE1OSUUc3AcIxuPwzjgCIs8TcfXa4A6Cthm		
//		auth.inMemoryAuthentication().withUser("member").password("$2a$10$tDDBbv/wuLZDQHsSeWgE1OSUUc3AcIxuPwzjgCIs8TcfXa4A6Cthm").roles("MEMBER");
//	}

//	//JDBC를 이용하기
//	@Override
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception{
//		log.info("configure JDBC..............................");
//		
//		String queryUser="select userid, userpw, enabled from tbl_member where userid=?";
//		String queryDetails = "select userid, auth from tbl_member_auth where userid=?";
//		
//		auth.jdbcAuthentication()
//			.dataSource(dataSource)
//			.passwordEncoder(passwordEncoder())
//			.usersByUsernameQuery(queryUser)
//			.authoritiesByUsernameQuery(queryDetails);
//	}

}
