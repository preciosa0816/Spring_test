package sample.interfaceno;

public class HelloApp {

	public static void main(String[] args) {
		MessageBeanEn me= new MessageBeanEn();
		me.sayHello("hong");
		
		MessageBeanKr mk= new MessageBeanKr();
		mk.sayHello("홍길동");

	}

}
