package d08_calculation;

import java.util.Scanner;

public class CalculationTest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������������");
		int n = sc.nextInt();

		System.out.println("������һ��1-9�е�������Ϊ�������֣�");
		int a = sc.nextInt();
		calculation(a, n);

		sc.close();
	}

	private static void calculation(int a, int n) {
		//ÿһ��ó���
		int sum = 0;
		int[] arr = new int[n];
		arr[0] = a;
		int i = 1;
		while(i<n) {
			a*=10;
			arr[i]=arr[i-1]+a;
			i++;
		}
	
		//ƴ��
		for(int b :arr) {
			 sum += b; 
			 if(b==arr[n-1]) {
				 System.out.print(b);
				 break;
			 }
			 System.out.print(b+"+");
			
		}
		System.out.println("="+sum);
	
	}
}
