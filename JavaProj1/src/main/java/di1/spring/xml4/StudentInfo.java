package di1.spring.xml4;

public class StudentInfo {
	private Student s;

	//생성자를 통한 주입
	public StudentInfo(Student s) {
		this.s = s;
	}
	
	public void getStudentInfo() {
		if(s!=null) {
			System.out.println("Name : "+s.getName());
			System.out.println("Age : "+s.getAge());
			System.out.println("ClassNum : "+s.getClassNum());
			System.out.println("GradeNum : "+s.getGradeNum());
			System.out.println("----------------------------------------");
		}
	}

	public void setS(Student s) {
		this.s = s;
	}
	
	
	
}
