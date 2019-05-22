package d14_judge_days;

import java.util.Scanner;

/*题目：输入某年某月某日，
 * 判断这一天是这一年的第几天？
 * 
 * */
public class JudgeTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useDelimiter("\\s");
		System.out.println("输入年月日 用空格隔开");
		int year = sc.nextInt();
		int month = sc.nextInt();
		int day = sc.nextInt();
		int sum = 0;
		switch (month) {
		case 1:
			sum = day;
			break;
		case 2:
			sum = day + 31;
			break;
		case 3:

			sum = day + 31 + 28;
			break;
		case 4:

			sum = day + 30 + 31 + 28;

			break;
		case 5:

			sum = day + 31 + 30 + 31 + 28;

			break;
		case 6:

			sum = day + 30 + 31 + 30 + 31 + 28;

			break;
		case 7:

			sum = day + 31 + 30 + 31 + 30 + 31 + 28;

			break;
		case 8:

			sum = day + 31 + 31 + 30 + 31 + 30 + 31 + 28;

			break;
		case 9:

			sum = day + 30 + 31 + 31 + 30 + 31 + 30 + 31 + 28;

			break;
		case 10:

			sum = day + 31 + 30 + 31 + 31 + 30 + 31 + 30 + 31 + 28;

			break;
		case 11:

			sum = day + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + 31 + 28;

			break;
		case 12:

			sum = day + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + 31 + 28;

			break;
		default:
			System.out.println("Error.");
			break;
		}
		if (month > 2 && year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			sum += 1;
		}
		System.out.println(sum);
	}
}
