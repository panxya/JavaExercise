package d05_grade;

import java.util.Scanner;

public class GradeTest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("输入分数");
		sc.close();
		int grade = sc.nextInt();
		// 判断
		if (grade > 100 || grade < 0) {
			System.out.println("输入无效");
		} else {
			String s = (grade >= 90) ? "A" : (grade >= 60) ? "B" : "C";
			System.out.println(s);
		}
	}

}
