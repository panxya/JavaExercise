package day_12;

import java.util.Scanner;

/*
 * 这是猜数字小游戏
*/
public class GuessNameGame {
	private GuessNameGame() {
	}

	public static void start() {
		// 一个随机数
		int number = (int) (Math.random() * 100) + 1;

		while (true) {
			// 键盘录入数据
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入你的猜测");
			int guessNum = sc.nextInt();

			// 判断
			if (guessNum < number) {
				System.out.println("你猜的数字" + guessNum + "小了");
			} else if (guessNum > number) {
				System.out.println("你猜的数字" + guessNum + "大了");
			} else {
				System.out.println("你猜对了");
				break;
			}
			sc.close();
		}
	
	}

}
