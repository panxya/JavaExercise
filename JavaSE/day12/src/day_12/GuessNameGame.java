package day_12;

import java.util.Scanner;

/*
 * ���ǲ�����С��Ϸ
*/
public class GuessNameGame {
	private GuessNameGame() {
	}

	public static void start() {
		// һ�������
		int number = (int) (Math.random() * 100) + 1;

		while (true) {
			// ����¼������
			Scanner sc = new Scanner(System.in);
			System.out.println("��������Ĳ²�");
			int guessNum = sc.nextInt();

			// �ж�
			if (guessNum < number) {
				System.out.println("��µ�����" + guessNum + "С��");
			} else if (guessNum > number) {
				System.out.println("��µ�����" + guessNum + "����");
			} else {
				System.out.println("��¶���");
				break;
			}
			sc.close();
		}
	
	}

}
