package di1.spring.no;

public class MainClass1 {

	public static void main(String[] args) {
		
		MyCalculator myCalculator = new MyCalculator();
		myCalculator.setCalculator(new Calculator());
		myCalculator.setFirstName(10);
		myCalculator.setSecondName(2);
		
		System.out.println("===================================================");
		myCalculator.add();
		myCalculator.div();
		myCalculator.mul();
		myCalculator.sub();
//		System.out.println("===================================================");
//		myCalculator.calculator.addition(5, 5);
//		myCalculator.calculator.division(5, 5);
//		myCalculator.calculator.multiplication(5, 5);
//		myCalculator.calculator.division(5, 5);
//		System.out.println("===================================================");
//		myCalculator.getCalculator().addition(5, 5);
//		myCalculator.getCalculator().division(5, 5);
//		myCalculator.getCalculator().multiplication(5, 5);
//		myCalculator.getCalculator().division(5, 5);

	}

}
