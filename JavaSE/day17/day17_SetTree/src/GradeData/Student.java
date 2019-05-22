package GradeData;

public class Student {
	String name;
	int Chinese;
	int Math;
	int English;
	public Student(String name, int chinese, int math, int english) {
		super();
		this.name = name;
		Chinese = chinese;
		Math = math;
		English = english;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getChinese() {
		return Chinese;
	}
	public void setChinese(int chinese) {
		Chinese = chinese;
	}
	public int getMath() {
		return Math;
	}
	public void setMath(int math) {
		Math = math;
	}
	public int getEnglish() {
		return English;
	}
	public void setEnglish(int english) {
		English = english;
	}
	
	public int sum() {
		
		return this.Chinese+this.Math+this.English;
	}
}
