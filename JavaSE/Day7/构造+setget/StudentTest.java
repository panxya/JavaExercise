/*
学生类 
 成员变量 name age
 构造方法 无参 有参
 成员方法 get set show 输出



*/

class Student {
	private String name;
	private int age;

	public Student() {
	}
	
	public Student (int age,String name) {
		this.name = name;
		this.age = age;
	}
	//和set一个功能的构造方法
	
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
	
	//输出所有成员变量值
	public void show() {
	System.out.println(name+age);
	
	}
	
}

class StudentTest {
	public static void main(String[] args) {
	//创建对象
		Student a1 = new Student();
	//赋值

		a1.setName("林林");
		a1.setAge(11);
		
	//输出值
		System.out.println(a1.getName()+"--------"+a1.getAge());
		a1.show();
	
	//方式二赋值
		Student a2 = new Student(22,"莫莫");
		System.out.println(a2.getName()+"--------"+a2.getAge());
		
		a2.show();
	
	}
	 


}	
	