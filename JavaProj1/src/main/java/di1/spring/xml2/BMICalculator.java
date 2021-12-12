package di1.spring.xml2;
//비만도 측정
public class BMICalculator {
	private double lowWeight;
	private double normalWeight;
	private double overWeight;
	private double obesity;
	
	//비만도측정
	public void bmiCalculator(double weight, double height) {
		double h=height*0.01;
		double result = weight/(h*h);
		System.out.println("BMI index : "+(int)result);
		if(result>obesity) {
			System.out.println("obesity");
		}else if(result>overWeight) {
			System.out.println("over weight");
		}else if(result>normalWeight) {
			System.out.println("normal weight");
		}else {
			System.out.println("low weight");
		}
	}

	public void setLowWeight(double lowWeight) {
		this.lowWeight = lowWeight;
	}

	public void setNormalWeight(double normalWeight) {
		this.normalWeight = normalWeight;
	}

	public void setOverWeight(double overWeight) {
		this.overWeight = overWeight;
	}

	public void setObesity(double obesity) {
		this.obesity = obesity;
	}
	
	
	
}
