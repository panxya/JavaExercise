package d15_compare;

import java.util.Scanner;

public class Answer {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in).useDelimiter("\\D");
		System.out.print("��������������");
		int x = scan.nextInt();
		int y = scan.nextInt();
		int z = scan.nextInt();
		scan.close();
		System.out.println("��������"+sort(x,y,z));
	}
	//�Ƚ��������Ĵ�С
	private static String sort(int x,int y,int z){
		String s = null;
		if(x>y){
			int t = x;
			x = y;
			y = t;
		}
		if(x>z){
			int t = x;
			x = z;
			z = t;
		}
		if(y>z){
			int t = z;
			z = y;
			y = t;
		}
		s = x+" "+y+" "+z;
		return s;
		}

}
