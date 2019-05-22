package cn.itcast.game;

import java.util.Scanner;

/**
 * 登录成功后的猜数字小游戏
 * 
 * @author 小杨
 * @version V1.0
 */
public class Game {
	private Game () {} 
	public static void startit() {
		// TODO Auto-generated method stub
		int a = (int) (Math.random() * 100) + 1;

		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入你猜的数字");
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
