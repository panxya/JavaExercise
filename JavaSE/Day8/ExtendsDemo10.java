//��ʦ��ѧ������ ʹ��ǰ
/*
��Ա ��������������
�ṹ�������޲ι���  ���ι���
��Ա������get set

*/

class Student {
	private int age;
	private String name;
	
	//����
	public Student() {
	}

	public Student(int age,String name) {
	this.name = name;
	this.age = age;
	}
	
	//����
	
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
	
	//����
	public Teacher() {
	}

	public Teacher(int age,String name) {
	this.name = name;
	this.age = age;
	}
	
	//����
	
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
		s1.setName("����");
		System.out.println(s1.getName()+"-------"+s1.getAge());

		
		Student s2 = new Student(10,"С��");
		System.out.println(s2.getName()+"-------"+s2.getAge());
		
		Teacher t1 = new Teacher();
		t1.setAge(55);
		t1.setName("С��");
		System.out.println(t1.getName()+"-------"+t1.getAge());
	
		Teacher t2 = new Teacher(37,"����");
		System.out.println(t2.getName()+"-------"+t2.getAge());
		
	
	}


}