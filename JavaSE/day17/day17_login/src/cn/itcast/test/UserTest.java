package cn.itcast.test;

import java.util.Scanner;

import cn.itcast.dao.UserDao;
import cn.itcast.dao.impl.UserDaoImpl;
import cn.itcast.game.Game;
import cn.itcast.pojo.User;

/**
 * �û�������
 * 
 * @author С��
 * @version V10.0
 */
public class UserTest {
	public static void main(String[] args) {
		while (true) {
			// �������� ѡ�������
			System.out.println("--------------Welcome--------------");
			System.out.println("login");
			System.out.println("regist");
			System.out.println("exit");
			System.out.println("Please enter your choise.");

			Scanner sc = new Scanner(System.in);
			// ���ִ����� ���ڷ���
			String choiceString = sc.nextLine();

			// Switch ���ʹ��
			UserDao ud = new UserDaoImpl(); // ��̬
			switch (choiceString) {
			case "login":
				System.out.println("--------------login--------------");
				System.out.println("Enter your UserName");
				String UserName = sc.nextLine();
				System.out.println("Enter your Passworde");
				String Password = sc.nextLine();

				// ���õ�¼����
				boolean flag = ud.isLigin(UserName, Password);
				if (flag) {
					System.out.println("login Successful");
					System.out.println("You can begin the guess nnumber game.");
					System.out.println("Do you want to begin? Y/N");
					while (true) {
						String sss = sc.nextLine();
						if (sss.equals("Y")) {
							Game.startit();
							System.out.println("Do you want to begin? Y/N");
						}else {
							break;
						}
						
						System.out.println("Thanks for your use.");
						System.exit(0);
					}

					
				} else {
					System.out.println("Password or username is false.");
				}

				break;
			case "regist":
				System.out.println("--------------regist--------------");
				System.out.println("Enter your UserName");
				String newUserName = sc.nextLine();
				System.out.println("Enter your Passworde");
				String newPassword = sc.nextLine();

				// �û����ݷ�װ�������
				User user = new User();
				user.setUserName(newUserName);
				user.setPassword(newPassword);

				// ����ע��

				ud.regist(user);
				System.out.println("Regist Successful.");

				break;
			case "exit":
			default:
				System.out.println("Thanks and waiting for your next use.");
				System.exit(0);
				break;
			}
		}
	}
}
