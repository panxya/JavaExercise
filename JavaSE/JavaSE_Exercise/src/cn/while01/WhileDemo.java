package cn.while01;

public class WhileDemo {
	public static void main(String[] args) {
		int start = 1;
		int end = 884400;
		
		int count = 0;
		
		while(start<end) {
			start *=2;
			count++;
			System.out.println("��"+count+"�ν��Ϊ"+start);
		}
		
		System.out.println("���۵�"+count+"�Ρ�");
		
	}
}
