package di1.spring.xml4;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

//Constructor 를 통한 DI(Dependency Injection)
public class MainClass {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:construct_ctx.xml");
		
		//xml에서 bean에 직접주입한 것 출력
		StudentInfo si=ctx.getBean("studentInfo", StudentInfo.class);
		si.getStudentInfo();
		
		//학생2의 정보를 main으로 가져와 주입하고 출력
		Student s2=ctx.getBean("student2", Student.class);
		si.setS(s2);
		si.getStudentInfo();
		
	}

}
