package day_12;
/*
 * ����¼���ַ���   ����д Сд ������
 * 
 * ¼��
 * ����ͳ�Ʊ���
 * ����
 * �ж�
 * 
*/

import java.util.Scanner;

public class CountDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("¼���ַ���");
		String a = sc.nextLine();
//ͳ����
		int bigcount = 0;
		int smallcount = 0;
		int numcount = 0;
//����
		for(int x = 0;x<a.length();x++) {
			char ch = a.charAt(x);	
//�ж�			
			if(ch>= 'a'&&ch<='z') {
				smallcount++;
			}else if(ch>= 'A'&&ch<='Z'){
				bigcount++;
			
			}else if(ch>= '0'&&ch<='9'){
				numcount++;
			}
		}
		System.out.println("��д��ĸ����"+bigcount);
		System.out.println("Сд��ĸ����"+smallcount);
		System.out.println("��������"+numcount);
		sc.close();
	}
}




