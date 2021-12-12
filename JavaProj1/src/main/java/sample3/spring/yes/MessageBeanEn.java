package sample3.spring.yes;

public class MessageBeanEn implements MessageBean {

	@Override
	public void sayHello(String name) {
		System.out.println("Hello "+name+"!");

	}

}
