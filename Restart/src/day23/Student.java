package day23;

public class Student {

	
	private String name;
	private int english;
	private int math;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(String name, int english, int math) {
		
		this.name=name;
		this.english=english;
		this.math=math;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}
	
	
	
}
