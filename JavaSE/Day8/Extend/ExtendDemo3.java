//���ܼ̳�˽�г�Ա�������Ա������������ͨ����������ȥ��δ��˽�б���

class Extend3 {
	private int num = 1;
	int num1 = 2;
	
	
	//��Ա����ʹ��˽�б���
	
	public void show() {
		System.out.println("You can use it.");
		System.out.println(num1);
		System.out.println(num);	
	}

}

//�̳�
class Student extends Extend3 {
	public void function() {
		System.out.println(num1);
	}
}

//ʹ�÷����� main
class ExtendDemo3 {
	public static void main(String[] args) {
	Student s = new Student();	
	s.show();
	s.function();
	
	
	}

}