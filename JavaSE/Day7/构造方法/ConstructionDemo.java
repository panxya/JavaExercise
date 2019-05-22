class Student {
	private int age;
	private String name;
	
	public Student() {
		System.out.println("这是一个无参构造方法");
	}
		
	public Student(String name) {
		System.out.println("这是一个String类型的构造方法");
		this.name = name;
	}
	
	public Student(String name,int age) {
		System.out.println("这是一个int和String类型的构造方法");
		this.name = name;
		this.age = age;
	}
	public Student(int age) {
		System.out.println("这是一个int类型的构造方法");
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
		
		Student s3 = new Student("小芳");
		s3.show();
		System.out.println("-----------");

		Student s4 = new Student("小芳",22);
		s4.show();
		System.out.println("-----------");
	}
}