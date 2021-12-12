package di1.spring.anno1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=
				new AnnotationConfigApplicationContext(ApplicationConfig.class);
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
		
		ctx.close();
	}

}
