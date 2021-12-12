package di1.spring.xml;

public class MyCalculator {
	Calculator calculator;
	private int firstName;
	private int secondName;
	
	public MyCalculator() {
		
	}
	
	public void add() {
		calculator.addition(firstName, secondName);
	}
	
	public void sub() {
		calculator.subtraction(firstName, secondName);
	}

	public void mul() {
		calculator.multiplication(firstName, secondName);
	}
	
	public void div() {
		calculator.division(firstName, secondName);
	}

	public Calculator getCalculator() {
		return calculator;
	}

	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}

	public int getFirstName() {
		return firstName;
	}

	public void setFirstName(int firstName) {
		this.firstName = firstName;
	}

	public int getSecondName() {
		return secondName;
	}

	public void setSecondName(int secondName) {
		this.secondName = secondName;
	}
	
	
	
}

