package di2.spring.xml_anno;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

//xml 주인과 JAVA(Annotation) 종속 구조 
public class MainClass {

	public static void main(String[] args) {
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:xml_anno.xml");
		
		Student s=ctx.getBean("student1", Student.class);
		System.out.println("name: "+s.getName());
		System.out.println("age: "+s.getAge());
		System.out.println("hobbies: "+s.getHobbies());
		System.out.println("height: "+s.getHeight());
		System.out.println("weight: "+s.getWeight());
		
		System.out.println("===============================================================");
		
		
		Student s2=ctx.getBean("student2", Student.class);
		System.out.println("name: "+s2.getName());
		System.out.println("age: "+s2.getAge());
		System.out.println("hobbies: "+s2.getHobbies());
		System.out.println("height: "+s2.getHeight());
		System.out.println("weight: "+s2.getWeight());
		
		System.out.println("===============================================================");
		
		
		Student s3=ctx.getBean("studentx", Student.class);
		System.out.println("name: "+s3.getName());
		System.out.println("age: "+s3.getAge());
		System.out.println("hobbies: "+s3.getHobbies());
		System.out.println("height: "+s3.getHeight());
		System.out.println("weight: "+s3.getWeight());
		
		ctx.close();
	}

}
