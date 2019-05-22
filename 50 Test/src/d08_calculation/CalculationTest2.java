package d08_calculation;

import java.util.Scanner;

public class CalculationTest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入项数：");
		int n = sc.nextInt();

		System.out.println("请输入一个1-9中的数字作为计算数字：");
		int a = sc.nextInt();
		calculation(a, n);

		sc.close();
	}

	private static void calculation(int a, int n) {
		//每一项得出来
		int sum = 0;
		int[] arr = new int[n];
		arr[0] = a;
		int i = 1;
		while(i<n) {
			a*=10;
			arr[i]=arr[i-1]+a;
			i++;
		}
	
		//拼接
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
