//��̬
//�ṹ
//�ֲ�

class Code {
	//�ṹ��
	{int x = 100;
	System.out.println(x);
	}	
	
	//��̬��
	static {int y = 200;
	System.out.println(y);
	}
	
	//���췽��
	public Code(int b) {
	System.out.println("300");
	}

}

class CodeDemo {
	public static void main(String[] args) {
	//�ֲ���
	
		{int z = 400;
		System.out.println(z);
		}
		
	//��������
		Code b = new Code(2);
		System.out.println("------");
		Code bb = new Code(1);
	}
}