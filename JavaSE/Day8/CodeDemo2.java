//��̬��  ����� ���취
class Code2 {
	//��̬��
	static {
	System.out.println("��̬��");
	}
	//�����
	{
	System.out.println("�ṹ��");
	}
	//���취
	Code2() {
	System.out.println("����һ���ṹ����");
	
	}
}


class CodeDemo2 {
	static {
		System.out.println("����һ����̬�ľֲ�������");
	}
	public static void main(String[] args) {
		System.out.println("main����");
		{
			System.out.println("�ֲ�����");
		}
		
		Code2 s = new Code2();
		Code2 ss = new Code2();
	}

}