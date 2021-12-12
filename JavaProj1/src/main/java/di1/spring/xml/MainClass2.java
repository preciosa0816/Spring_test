package di1.spring.xml;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass2 {

	public static void main(String[] args) {
		//container1
//		ApplicationContext factory=new ClassPathXmlApplicationContext("applicationCTX1.xml"); 
//		Calculator calculator = factory.getBean("calculator",Calculator.class); 
//		MyCalculator myCalculator = factory.getBean("myCalculator",MyCalculator.class);
		
		//container2
		AbstractApplicationContext ctx = 
				new GenericXmlApplicationContext("classpath:applicationCTX1.xml");
		//MyCalculator myCalculator=ctx.getBean("myCalculator", MyCalculator.class); //방법1
		MyCalculator myCalculator=(MyCalculator) ctx.getBean("myCalculator"); //방법2:형변환
		
		myCalculator.add();
		myCalculator.div();
		myCalculator.mul();
		myCalculator.sub();
		
		ctx.close();
	}

}
