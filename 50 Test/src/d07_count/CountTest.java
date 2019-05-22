package d07_count;

import java.util.Scanner;

/*��ֻ�Ƿ�ʽһ answer��ʽ������ArrayList
 * ����һ���ַ����ֱ�ͳ�Ƴ�����Ӣ����ĸ���ո����ֺ������ַ��ĸ�����
�������������while���,����Ϊ������ַ���Ϊ'\n'.

*/
public class CountTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
	
		count(s);
		sc.close();
	}

	private static void count(String s) {

		int engCount = 0;
		int numCount = 0;
		int spaceCount = 0;
		int otherCount = 0;

		//ͨ������ֵ��ȡÿһ���ַ� ����������ʽ���жԱ�
		//ÿ���ַ���ֻ��һ��ֵ
		for (int i = 0; i < s.length()-1; i++) {
			String ss = String.valueOf(s.charAt(i));
			if (ss.matches("[a-zA-Z]")) {
				engCount++;
			} else if (ss.matches("\\d")) {
				numCount++;
			} else if (ss.matches("\\s")) {
				spaceCount++;
			} else {
				otherCount++;
			}
		}

		System.out.println("��ĸ��Ϊ��" + engCount + "��������Ϊ��" + numCount + "���ո���Ϊ��" + spaceCount + "��������Ϊ��" + otherCount);
	}

}
