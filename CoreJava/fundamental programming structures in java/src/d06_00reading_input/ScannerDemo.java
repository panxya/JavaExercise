package d06_00reading_input;
/**
 * This program demonstrates console input.
 * @version 1.0 18.12.9
 * @author С��
 */
import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//��������"
		System.out.println("Please enter your name.");
		String name = sc.nextLine();
		//��������
		System.out.println("Enter your age.");
		int age = sc.nextInt();
		System.out.println("Your name is "+name+" and age is "+age+".");
		
	}
}
