package day17_SetTree;

public class Student implements Comparable<Student> {
	String name;
	int age;

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		int num = this.age - o.age;

		int num2 = num == 0 ? this.name.compareTo(o.name) : num;

		return num2;
	}

}
