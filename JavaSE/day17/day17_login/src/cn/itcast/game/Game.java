package cn.itcast.game;

import java.util.Scanner;

/**
 * ��¼�ɹ���Ĳ�����С��Ϸ
 * 
 * @author С��
 * @version V1.0
 */
public class Game {
	private Game () {} 
	public static void startit() {
		// TODO Auto-generated method stub
		int a = (int) (Math.random() * 100) + 1;

		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("��������µ�����");
			int b = sc.nextInt();

			if (a == b) {
				System.out.println("Congratulation! You are right.");
				break;
			} else if (a > b) {
				System.out.println("Your number" + b + "is smaller than the right answer.");
			} else {
				System.out.println("Your number" + b + "is bigger than the right answer.");
			}

		}

	}
}
