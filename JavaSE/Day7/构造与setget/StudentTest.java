/*
ѧ���� 
 ��Ա���� name age
 ���췽�� �޲� �в�
 ��Ա���� get set show ���



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
	//��setһ�����ܵĹ��췽��
	
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
	
	//������г�Ա����ֵ
	public void show() {
	System.out.println(name+age);
	
	}
	
}

class StudentTest {
	public static void main(String[] args) {
	//��������
		Student a1 = new Student();
	//��ֵ

		a1.setName("����");
		a1.setAge(11);
		
	//���ֵ
		System.out.println(a1.getName()+"--------"+a1.getAge());
		a1.show();
	
	//��ʽ����ֵ
		Student a2 = new Student(22,"ĪĪ");
		System.out.println(a2.getName()+"--------"+a2.getAge());
		
		a2.show();
	
	}
	 


}	
	