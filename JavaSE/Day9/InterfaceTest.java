/*
人类：
	成员变量：姓名，年龄，
	构造方法 ：无参 带参
	成员方法：吃饭（）｛｝，  睡觉（）
	抽烟接口

*/

interface Smoking {
	public abstract void smoke();
}

abstract class Person {
	private String name;
	private int age;
	//数据初始化
	public Person() {}
	public Person(String name,int age) {
		this.name = name;
		this.age = age;	
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public abstract void eat();
	
	public void sleep() {
		System.out.println("Sleep in night.");
	}
	
}

//具体学生类

class Student extends Person {
	public Student() {}
	public Student(String name,int age) {
		super(name,age);
	}

	public void eat() {
		System.out.println("吃饭先");
	}
	
}

class Teacher extends Person {
	public Teacher() {}
	public Teacher(String name,int age) {
		super(name,age);
	}

	public void eat() {
		System.out.println("等学生吃完再去");
	}
	
}

class SmokingTeacher extends Teacher implements Smoking {

	public SmokingTeacher() {}
	public SmokingTeacher(String name,int age) {
		super(name,age);
	}

	public void smoke() {
		System.out.println("抽烟的老师");
	}
	
}



class SmokingStudent extends Student implements Smoking {

	public SmokingStudent() {}
	public SmokingStudent(String name,int age) {
		super(name,age);
	}

	public void smoke() {
		System.out.println("抽烟的学生");
	}
	
}


class InterfaceTest {
	public static void main(String[] args) {
		SmokingStudent s = new SmokingStudent();
		s.setName("高高");
		s.setAge(15);
		System.out.println("姓名："+s.getName()+"，年龄："+s.getAge());
		s.smoke();
		s.eat();
		s.sleep();
		
		SmokingTeacher t = new SmokingTeacher("明老师",22);
		System.out.println("姓名："+t.getName()+"，年龄："+t.getAge());
		t.smoke();
		t.eat();
		t.sleep();
}	
	
}
