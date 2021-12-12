package org.zerock.sample;

import static org.junit.Assert.assertNotNull;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

//junit Test : 단위테스트 
//Spring test 설정 : spring-test
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")//지정된 클래스나 문자열을 이용해서 필요한 객체들을 스프링 내에 객체로 등록
@Log4j //Lombok을 이용해서 로그를 기록하는 Logger를 변수로 생성. 
public class SampleTests { 
	
	@Setter(onMethod = @__({@Autowired})) 
	// == @Setter(onMethod_ = {@Autowired})
	//onMethod : setter메서드의 생성 시 메서드에 추가할 어노테이션 지정 . 
	//value : 접근제한소것ㅇ(기본값 : lombok.AccessLevel.PUBLIC)
	//onParam:setter 메서드의 파라미터에 어노테이션을 사용하는 경우 적용
	
	//@Autowired 해당 인스턴스 변수가 스프링으로부터 자동으로 주입해달라는 표시. 
		// 스프링은 정상적으로 주입이 가능하다면 obj변수에 Restaurant 타입의 객체를 주입
	
	private Restaurant restaurant; //Restaurant Class 를 setter()를 통한 주입
		
	@Test //JUnit에서 테스트 대상표시
	public void testExist() {
		assertNotNull(restaurant);//restaurant 변수가 null이 아니어야만 테스트가 성공한다

		log.info(restaurant);
		log.info("--------------------------");
		log.info(restaurant.getChef());
	}
	
}
