package di2.spring.xml_anno;

import java.util.ArrayList;

public class Student {
	private String name;
	private int age;
	private ArrayList<String> hobbies;
	private double height;
	private double weight;
	
	//생성자존재 (3개만)
	public Student(String name, int age, ArrayList<String> hobbies) {
		super();
		this.name = name;
		this.age = age;
		this.hobbies = hobbies;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setHobbies(ArrayList<String> hobbies) {
		this.hobbies = hobbies;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public ArrayList<String> getHobbies() {
		return hobbies;
	}

	public double getHeight() {
		return height;
	}

	public double getWeight() {
		return weight;
	}
	
	

}
