package day_12;
/*
 * 
 * ͳ�Ʊ���
 * ����λ��
 * 	����-1 ����ͳ�Ʊ���
 *  ����������ͳ�Ʊ���==
 * ����+����λ���ٴν�ȡ���ַ��� �󷵻�
 * ���ز���
 * 
*/
public class Stringtest2 {
	public static void main(String[] args) {
		String big = "sishisishisishisishishisishishisishishisi";
		String small = "si";
		
		int c = CountString(big,small);
		System.out.println(c);
		
	}
	
	public static int CountString (String big,String small) {
		int x = 0;
		//����
		int index = big.indexOf(small);
		
		while(index != -1) {
			x++;
			//С��+����  ���¶����
			int s = index+small.length();
			big = big.substring(s);
			//����
			index = big.indexOf(small);
			
		}
		return x;
	}
}
