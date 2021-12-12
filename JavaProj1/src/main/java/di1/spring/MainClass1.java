package di1.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainClass1 {

	public static void main(String[] args) {
		ApplicationContext factory=new ClassPathXmlApplicationContext("applicationCTX1.xml"); 
		
		
		
		Calculator calculator = factory.getBean("calculator",Calculator.class); 
		MyCalculator myCalculator = factory.getBean("myCalculator",MyCalculator.class);
		calculator.addition(10, 2);
		calculator.division(10, 2);
		calculator.multiplication(10, 2);
		calculator.division(10, 2);
		System.out.println("===================================================");
		myCalculator.add();
		myCalculator.div();
		myCalculator.mul();
		myCalculator.sub();
		System.out.println("===================================================");
		myCalculator.calculator.addition(5, 5);
		myCalculator.calculator.division(5, 5);
		myCalculator.calculator.multiplication(5, 5);
		myCalculator.calculator.division(5, 5);
		System.out.println("===================================================");
		myCalculator.getCalculator().addition(5, 5);
		myCalculator.getCalculator().division(5, 5);
		myCalculator.getCalculator().multiplication(5, 5);
		myCalculator.getCalculator().division(5, 5);

		
	}

}
