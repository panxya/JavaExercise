class Student {
	//����
	String name;
	//����
	private int age;
	
	//��ʾ���г�Ա����ֵ
	public void show() {
		System.out.println("������"+name);
		System.out.println("���䣺"+age);
		}
	//����У��
	public void SetAge(int a) {
		if(a<0 || a>128) {
			System.out.println("����");
	
		}else {
			age = a;
			}
		}
}

class StudentDemo {
	public static void main(String[] agrs) {
	Student s = new Student();
	s.show();
	System.out.println("------------");
	//��ֵ
	s.name = "Ϊ";
	s.SetAge(22);
	s.SetAge(1000);
	s.show();
	
	}
}