package d08_calculation;

import java.util.Scanner;

/*求s=a+aa+aaa+aaaa+aa...a的值，其中a是一个数字。
 * 例如2+22+222+2222+22222(此时共有5个数相加)，几个数相加有键盘控制。 
 * */
public class CalculationTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入项数：");
	int n = scanner.nextInt();
		
		System.out.println("请输入一个1-9中的数字作为计算数字：");
		int a = scanner.nextInt();
		int result = calculation(a,n);
		System.out.println(result);
		scanner.close();
		
	}

	private static int calculation(int a, int n) {
		int b = a;
		int sum = 0;
		for(int i = 1;i<=n;i++) {
			if(i==1) {
				sum = a;
				System.out.print(a+"+");
			}else if(i==n) {
				a += b*Math.pow(10, i-1);//a=a+原a乘10的i-1此方
				System.out.print(a+"=");
				sum += a;
			}else {
				a += b*Math.pow(10, i-1);//a=a+原a乘10的i-1此方
				System.out.print(a+"+");
				sum += a;
			}
			
		}
		
		return sum;
	}
}
