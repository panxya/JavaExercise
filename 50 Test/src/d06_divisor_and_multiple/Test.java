package d06_divisor_and_multiple;

import java.util.Scanner;

/*输入两个正整数m和n，求其最大公约数和最小公倍数。
 * *1、先求最大公约数bigDivisor

 *2、就可以很方便获得最小公倍数multiple=input1*input2/bigDIvisor

 *这里最重要的就是求最大公约数：求法如下 

 *(1)用大的数对小的数求余

 *(2)把小的数赋值给大的数，把求余获得的结果赋值给小的数，

 *(3)循环上一步的操作，直到求余的结果为零

 *(4)上一步被求余的数就是我们要的最大公约数，不信的话，你可以动手试试

 * */
public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个数");
		int m = sc.nextInt();
		int i = m;
		System.out.println("请输入第二个数");
		int n = sc.nextInt();
		int j = n;
		sc.close();
		if (m < n) {
			int temp = m;
			m = n;
			n = temp;
		}
		while (true) {
			 
			if (m%n == 0) {
				System.out.println(n+"为最大公约数");
				System.out.println(i*j/n+"为最大公倍数");
				break;
			}else {
				int temp=m;
				m = n;
				n=temp%n;				
			}
		}
	}
}
