package d47_Scanner;
//读取7个数（1—50）的整数值，每读取一个值，程序打印出该值个数的＊。
import java.util.Scanner;



public class Test {
	public static void main(String[] args) {
		for(int i = 0;i<5;i++) {	
			int ai = (int)(Math.random()*10);
			System.out.println(ai);
			printStar(ai);
		}
		
		
	}

	private static void printStar(int ai) {
		
		for(int i = 0;i<ai;i++) {
			System.out.print("*");
		}
		System.out.println();
		
	}	
}
