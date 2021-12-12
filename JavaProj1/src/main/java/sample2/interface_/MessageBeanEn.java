package sample2.interface_;

public class MessageBeanEn implements MessageBean {

	@Override
	public void sayHello(String name) {
		System.out.println("Hello "+name+"!");

	}

}
