package match;
import java.util.Scanner;
public class match {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String qq = sc.nextLine();
		
		String regex = "[1-9][0-9]{4,14}";
		boolean flag =qq.matches(regex);
		System.out.println(flag);
		
	}
}
