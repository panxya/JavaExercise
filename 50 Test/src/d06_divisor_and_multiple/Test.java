package d06_divisor_and_multiple;

import java.util.Scanner;

/*��������������m��n���������Լ������С��������
 * *1���������Լ��bigDivisor

 *2���Ϳ��Ժܷ�������С������multiple=input1*input2/bigDIvisor

 *��������Ҫ�ľ��������Լ���������� 

 *(1)�ô������С��������

 *(2)��С������ֵ����������������õĽ����ֵ��С������

 *(3)ѭ����һ���Ĳ�����ֱ������Ľ��Ϊ��

 *(4)��һ�������������������Ҫ�����Լ�������ŵĻ�������Զ�������

 * */
public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ����");
		int m = sc.nextInt();
		int i = m;
		System.out.println("������ڶ�����");
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
				System.out.println(n+"Ϊ���Լ��");
				System.out.println(i*j/n+"Ϊ��󹫱���");
				break;
			}else {
				int temp=m;
				m = n;
				n=temp%n;				
			}
		}
	}
}
