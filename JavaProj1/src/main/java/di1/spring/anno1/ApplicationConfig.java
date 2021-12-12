package di1.spring.anno1;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //Annotation 방식 , 클래스 객체생성
public class ApplicationConfig {
//	<bean id="calculator" class="di1.spring.xml.Calculator"></bean>
//	<bean id="myCalculator" class="di1.spring.xml.MyCalculator">
//		<property name="calculator">
//			<ref bean="calculator"/>
//		</property>
//		<property name="firstName" value="10"/> <!-- setter method가 존재해야함 -->
//		<property name="secondName" value="2"/>
//	</bean>
	
	@Bean //객체생성 : Student 클래스 
	public Student student1() {
		ArrayList<String> hobbies = new ArrayList<String>();
		hobbies.add("swimming");
		hobbies.add("cooking");
		hobbies.add("reading");
		
		Student s = new Student("hong", 20, hobbies);		
		s.setHeight(185);
		s.setWeight(80);
		return s;		
	}
	@Bean //객체생성 : Student 클래스 
	public Student student2() {
		ArrayList<String> hobbies = new ArrayList<String>();
		hobbies.add("hiking");
		hobbies.add("travel");
		hobbies.add("baking");
		
		Student s = new Student("dong", 20, hobbies);		
		s.setHeight(187);
		s.setWeight(84);
		return s;		
	}
	
}
