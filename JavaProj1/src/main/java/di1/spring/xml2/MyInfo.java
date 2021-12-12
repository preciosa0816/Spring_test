package di1.spring.xml2;

import java.util.ArrayList;

public class MyInfo {
	private String name;
	private double height;
	private double weight;
	
	private ArrayList<String> hobbies;
	private BMICalculator bmiCalculator;
	
	//일반 메소드
	public void bmiCalculation() {
		bmiCalculator.bmiCalculator(weight, height);
	}
	
	public void getInfo() {
		System.out.println("name: "+name);
		System.out.println("height: "+height);
		System.out.println("weight: "+weight);
		System.out.println("hobbies: "+hobbies);
		bmiCalculation();
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public void setHobbies(ArrayList<String> hobbies) {
		this.hobbies = hobbies;
	}
	public void setBmiCalculator(BMICalculator bmiCalculator) {
		this.bmiCalculator = bmiCalculator;
	}
	
	
}
