/*
���ࣺ
	��Ա���������������䣬
	���췽�� ���޲� ����
	��Ա�������Է�����������  ˯������
	���̽ӿ�

*/

interface Smoking {
	public abstract void smoke();
}

abstract class Person {
	private String name;
	private int age;
	//���ݳ�ʼ��
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

//����ѧ����

class Student extends Person {
	public Student() {}
	public Student(String name,int age) {
		super(name,age);
	}

	public void eat() {
		System.out.println("�Է���");
	}
	
}

class Teacher extends Person {
	public Teacher() {}
	public Teacher(String name,int age) {
		super(name,age);
	}

	public void eat() {
		System.out.println("��ѧ��������ȥ");
	}
	
}

class SmokingTeacher extends Teacher implements Smoking {

	public SmokingTeacher() {}
	public SmokingTeacher(String name,int age) {
		super(name,age);
	}

	public void smoke() {
		System.out.println("���̵���ʦ");
	}
	
}



class SmokingStudent extends Student implements Smoking {

	public SmokingStudent() {}
	public SmokingStudent(String name,int age) {
		super(name,age);
	}

	public void smoke() {
		System.out.println("���̵�ѧ��");
	}
	
}


class InterfaceTest {
	public static void main(String[] args) {
		SmokingStudent s = new SmokingStudent();
		s.setName("�߸�");
		s.setAge(15);
		System.out.println("������"+s.getName()+"�����䣺"+s.getAge());
		s.smoke();
		s.eat();
		s.sleep();
		
		SmokingTeacher t = new SmokingTeacher("����ʦ",22);
		System.out.println("������"+t.getName()+"�����䣺"+t.getAge());
		t.smoke();
		t.eat();
		t.sleep();
}	
	
}
