package d39_sum;

import java.util.Scanner;

/*��дһ��������
 * ����nΪż��ʱ�����ú�����1/2+1/4+...+1/n,
 * ������nΪ����ʱ�����ú���1/1+1/3+...+1/n(����ָ�뺯��)*/
public class Test {
	public static void main(String[] args) {
		int a = (int) (Math.random() * 30);
//		int a = 7;
		System.out.println(a);
		
		
		if(a%2==0) {
			System.out.println(even(a));
		}else {
			System.out.println(odd(a));
		}

	}

	private static double even(int a) {
		double sum = 0;
		for (int i = 2; i <a+1; i+=2) {
				sum += (1.0 / i);
				
			}
		return sum;
	}

	
	private static double odd(int a) {
		double sum = 0;
		for (int i = 1; i < a+1; i+=2) {
				sum += (1.0 / i);
			}
		return sum;
	}

	
}
