package d08_calculation;

import java.util.Scanner;

/*��s=a+aa+aaa+aaaa+aa...a��ֵ������a��һ�����֡�
 * ����2+22+222+2222+22222(��ʱ����5�������)������������м��̿��ơ� 
 * */
public class CalculationTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������������");
	int n = scanner.nextInt();
		
		System.out.println("������һ��1-9�е�������Ϊ�������֣�");
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
				a += b*Math.pow(10, i-1);//a=a+ԭa��10��i-1�˷�
				System.out.print(a+"=");
				sum += a;
			}else {
				a += b*Math.pow(10, i-1);//a=a+ԭa��10��i-1�˷�
				System.out.print(a+"+");
				sum += a;
			}
			
		}
		
		return sum;
	}
}
