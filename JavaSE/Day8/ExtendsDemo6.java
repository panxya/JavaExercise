//�޲κʹ����ڼ̳��еļ̳�
//����
class Father {
	public Father() {
		System.out.println("�����޲θ���");
	}

	public Father(String name){
		System.out.println("���Ǵ��θ���");
	}
	
	
	
}


class Son extends Father {
	public Son(){
		System.out.println("����һ���޲�����");
	}
	
	public Son(String name){
		System.out.println("����һ����������");
	}
	
}

class ExtendsDemo6 {
	public static void main(String[] args) {
		Son s = new Son();
		Son s1 = new Son("Ч��");
	}
}