package d03narcissistic_number;
/*
 * ��ӡ�����е�"ˮ�ɻ���"����ν"ˮ�ɻ���"��ָһ����λ����
 * ���λ���������͵��ڸ�������
 * ���磺153��һ��"ˮ�ɻ���"����Ϊ153=1�����η���5�����η���3�����η��� 
	�������������forѭ������100-999������ÿ�����ֽ����λ��ʮλ����λ��
 * 
 * */
public class NarcissisticTest {
	public static void main(String[] args) {
		int count = 0;
		
		
		for(int x = 100;x<1000;x++) {
			int bai = (int)x/10/10;
			int shi = (int)(x-bai*10*10)/10;
			int ge  = x-bai*10*10-shi*10;
			int num = ge*ge*ge+shi*shi*shi+bai*bai*bai;
			if(x == num) {
				System.out.println(x);
			}
		}
	}
}
