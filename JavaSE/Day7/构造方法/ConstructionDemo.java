class Student {
	private int age;
	private String name;
	
	public Student() {
		System.out.println("����һ���޲ι��췽��");
	}
		
	public Student(String name) {
		System.out.println("����һ��String���͵Ĺ��췽��");
		this.name = name;
	}
	
	public Student(String name,int age) {
		System.out.println("����һ��int��String���͵Ĺ��췽��");
		this.name = name;
		this.age = age;
	}
	public Student(int age) {
		System.out.println("����һ��int���͵Ĺ��췽��");
		this.age = age;
	}
	
	public void show() {
		System.out.println(name+"------"+age);
	}
		
}
	
	
class ConstructionDemo {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.show();
		System.out.println("-----------");
		
		Student s2 = new Student(22);
		s2.show();
		System.out.println("-----------");		
		
		Student s3 = new Student("С��");
		s3.show();
		System.out.println("-----------");

		Student s4 = new Student("С��",22);
		s4.show();
		System.out.println("-----------");
	}
}