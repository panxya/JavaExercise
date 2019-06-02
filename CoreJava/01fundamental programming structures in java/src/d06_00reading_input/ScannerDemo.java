package d06_00reading_input;
/**
 * This program demonstrates console input.
 * @version 1.0 18.12.9
 * @author 小杨
 */
import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//输入姓名"
		System.out.println("Please enter your name.");
		String name = sc.nextLine();
		//输入年龄
		System.out.println("Enter your age.");
		int age = sc.nextInt();
		System.out.println("Your name is "+name+" and age is "+age+".");
		
	}
}
