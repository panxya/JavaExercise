package day_12;

/*
*	分析：
*		a：定义用户名
*		b：录入用户名
*		c:比较
*		d:三次机会 for循环
*
*/
import java.util.Scanner;

public class ScannerDemo3 {
	public static void main(String[] args) {
		String name = "name";
		String password = "password";
		// 三次机会
		for (int x = 0; x < 3; x++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入用户名");
			String usename = sc.nextLine();
			System.out.println("请输入密码");
			String psw = sc.nextLine();

			if (usename.equals(name) && psw.equals(password)) {
				System.out.println("登录成功,开始猜数字小游戏");
				GuessNameGame.start();
				break;
			} else {

				if ((x - 2) == 0) {
					System.out.println("账户冻结");
				} else {
					System.out.println("你还有" + (2 - x) + "次机会");
				}
			}
			sc.close();
		}
	}
}
