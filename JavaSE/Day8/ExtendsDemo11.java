//�޼̳е�
/*
���� ��Ա��������������
	�ṹ�������޲δ���
	��Ա������set get
	
	

*/
class Person {
	private int age;
	private String name;
	//����
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
	//��һ
		Student s = new Student();
		s.setName("��Ԫ�");
		s.setAge(26);
		System.out.println(s.getName()+"______"+s.getAge());
	//��2
		Student s1 = new Student(100,"�����");
		System.out.println(s1.getName()+"______"+s1.getAge());
	
	
	
		Teacher t = new Teacher();
		t.setAge(50);
		t.setName("һ������");
		System.out.println(t.getName()+"---"+t.getAge());
		
		Teacher t1 = new Teacher();
		t1.setAge(20);
		t1.setName("����");
		System.out.println(t1.getName()+"---"+t1.getAge());
		
	}

}

