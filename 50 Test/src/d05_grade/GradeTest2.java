package d05_grade;

import java.util.Scanner;

public class GradeTest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������");
		sc.close();
		int grade = sc.nextInt();
		// �ж�
		if (grade > 100 || grade < 0) {
			System.out.println("������Ч");
		} else {
			String s = (grade >= 90) ? "A" : (grade >= 60) ? "B" : "C";
			System.out.println(s);
		}
	}

}
