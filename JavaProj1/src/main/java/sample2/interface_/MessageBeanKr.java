package sample2.interface_;

public class MessageBeanKr implements MessageBean {

	@Override
	public void sayHello(String name) {
		System.out.println("안녕하세요 "+name+"!");

	}

}
