package d47_Scanner;
//��ȡ7������1��50��������ֵ��ÿ��ȡһ��ֵ�������ӡ����ֵ�����ģ���
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
