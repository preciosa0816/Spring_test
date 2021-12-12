package di2.spring.xml_anno;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //Annotation 방식 , 클래스 객체생성
public class ApplicationConfig {
	
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
	public Student studentx() {
		ArrayList<String> hobbies = new ArrayList<String>();
		hobbies.add("a");
		hobbies.add("s");
		hobbies.add("d");
		
		Student s = new Student("f", 33, hobbies);		
		s.setHeight(157);
		s.setWeight(44);
		return s;		
	}
	
}
