package d39_sum;

import java.util.Scanner;

public class Answer {
	public static void main(String[] args){
		System.out.print("������һ��������");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		if(n%2==0)
		  System.out.println("�����"+even(n));
		else
		  System.out.println("�����"+odd(n));
	}
	//����
	static double odd(int n){
		double sum = 0;
		for(int i=1;i<n+1;i+=2){
			sum += 1.0/i;
		}
		return sum;
	}
	//ż��
	static double even(int n){
		double sum = 0;
		for(int i=2;i<n+1;i+=2){
			sum += 1.0/i;
		}
		return sum;
	}

}
