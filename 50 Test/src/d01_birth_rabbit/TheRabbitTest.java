package d01_birth_rabbit;
/*
 * �ŵ����⣺��һ�����ӣ��ӳ������3������ÿ���¶���һ�����ӣ�
 * С���ӳ����������º�ÿ��������һ�����ӣ��������Ӷ�������
 * ��ÿ���µ����Ӷ���Ϊ���٣� 
 * 1,1,2,3,5,8,13,21....  
 * 
 * */
public class TheRabbitTest {
	public static void main(String[] args) {
		//���30���µ�ֵ
		 for(int x = 1;x<30;x++) {
			 System.out.println("��"+x+"������"+getCount(x)+"��");
		 }
	}
	
		private static int getCount(int month) {
		if(month == 1||month== 2) {
			return 1;
		}else {
			return getCount(month-1)+getCount(month-2);
		}
	}
}