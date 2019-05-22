//无继承的
/*
人类 成员变量：姓名年龄
	结构方法：无参带参
	成员方法：set get
	
	

*/
class Person {
	private int age;
	private String name;
	//构造
	public Person() {}
	public Person(int age,String name) {
		this.age = age;
		this.name = name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	
	}
	public int getAge() {
		return age;
	}
	
}



class Student extends Person {
	public Student() {}
	public Student(int age,String name) {
		super(age,name);
	}
}

class Teacher extends Person {}

class ExtendsDemo11 {
	public static void main(String[] args) {
	//法一
		Student s = new Student();
		s.setName("朱元璋");
		s.setAge(26);
		System.out.println(s.getName()+"______"+s.getAge());
	//法2
		Student s1 = new Student(100,"猪刚鬣");
		System.out.println(s1.getName()+"______"+s1.getAge());
	
	
	
		Teacher t = new Teacher();
		t.setAge(50);
		t.setName("一代大儒");
		System.out.println(t.getName()+"---"+t.getAge());
		
		Teacher t1 = new Teacher();
		t1.setAge(20);
		t1.setName("如来");
		System.out.println(t1.getName()+"---"+t1.getAge());
		
	}

}

