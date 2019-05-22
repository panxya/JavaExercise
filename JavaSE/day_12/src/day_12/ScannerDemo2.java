package day_12;
import java.util.Scanner;
public class ScannerDemo2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String b = sc.nextLine();
		int a = sc.nextInt();
		System.out.println("a:"+b+",b:"+a);
		sc.close();
	}
}
