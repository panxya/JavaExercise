//���󣺳�Ա������ʹ�ù�ϵ  ʹ��˳�� ͬ���أ���ͬ���أ�
//����ֲ���Χ-�����Ա��Χ-�����Ա��Χ
class Extend4 {
	//�����Ա��Χ
	int num = 11;
	int num1 = 22;
	//�����Ա����
	public void show(){
		int num = 33;
		System.out.println(num);
	}
	//���෽��
	public void show1(){
		System.out.println(num);	
	}

}
//����
class Extend41 extends Extend4{
	public void time() {
		System.out.println(num);
	}
}

class ExtendDemo4 {
	public static void main(String[] args) {
		Extend41 e = new Extend41();
		e.time();//55
		e.show1();//11
		e.show();//33
		
	}

}