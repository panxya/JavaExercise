package day_12;

/*
*	������
*		a�������û���
*		b��¼���û���
*		c:�Ƚ�
*		d:���λ��� forѭ��
*
*/
import java.util.Scanner;

public class ScannerDemo3 {
	public static void main(String[] args) {
		String name = "name";
		String password = "password";
		// ���λ���
		for (int x = 0; x < 3; x++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("�������û���");
			String usename = sc.nextLine();
			System.out.println("����������");
			String psw = sc.nextLine();

			if (usename.equals(name) && psw.equals(password)) {
				System.out.println("��¼�ɹ�,��ʼ������С��Ϸ");
				GuessNameGame.start();
				break;
			} else {

				if ((x - 2) == 0) {
					System.out.println("�˻�����");
				} else {
					System.out.println("�㻹��" + (2 - x) + "�λ���");
				}
			}
			sc.close();
		}
	}
}
