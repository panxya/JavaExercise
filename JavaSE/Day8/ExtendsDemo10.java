//老师和学生案例 使用前
/*
成员 变量：姓名年龄
结构方法：无参构造  带参构造
成员方法：get set

*/

class Student {
	private int age;
	private String name;
	
	//构造
	public Student() {
	}

	public Student(int age,String name) {
	this.name = name;
	this.age = age;
	}
	
	//方法
	
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
	
}


class Teacher {
	private int age;
	private String name;
	
	//构造
	public Teacher() {
	}

	public Teacher(int age,String name) {
	this.name = name;
	this.age = age;
	}
	
	//方法
	
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
}

class ExtendsDemo10 {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setAge(19);
		s1.setName("芳芳");
		System.out.println(s1.getName()+"-------"+s1.getAge());

		
		Student s2 = new Student(10,"小明");
		System.out.println(s2.getName()+"-------"+s2.getAge());
		
		Teacher t1 = new Teacher();
		t1.setAge(55);
		t1.setName("小局");
		System.out.println(t1.getName()+"-------"+t1.getAge());
	
		Teacher t2 = new Teacher(37,"明爸");
		System.out.println(t2.getName()+"-------"+t2.getAge());
		
	
	}


}