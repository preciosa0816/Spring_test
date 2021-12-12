package sample3.spring.yes;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloApp {

	public static void main(String[] args) {
		//BeanFactory factory=new XmlBeanFactory("src/main/java/sample3/spring/yes"); 
		//Container:객체 생성과 관리
		//DI:Dependency Injection(의존주입)
		//Ioc:Inversion of Control
		ApplicationContext factory=new ClassPathXmlApplicationContext("beans.xml"); 
		MessageBean bean = factory.getBean("messageBean",MessageBean.class); //MessageBean를 구현한 클래스생성
		bean.sayHello("hong");
		
	}

}
