package d38_String_length;

import java.util.Scanner;

/*дһ��������
 * ��һ���ַ����ĳ��ȣ�
 * ��main�����������ַ�����
 * ������䳤�ȡ�*/
public class Answer {
	public static void main(String[] args) {
		System.out.println("������һ���ַ���");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();// ��ȡ������ַ���
		System.out.println("��������ַ����ǣ�" + input);
		System.out.println("��������ַ��������ǣ�" + input.length());
		scanner.close();
	}
}
