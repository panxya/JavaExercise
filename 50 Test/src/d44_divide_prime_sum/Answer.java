package d44_divide_prime_sum;

import java.util.Scanner;

public class Answer {
	public static void main(String[] args){
		System.out.print("������һ��ż����");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		if(n%2!=0){
		  System.out.println("������Ĳ���ż����");
		  return;
		}
		twoAdd(n);
	}
	//ż���ֽ�Ϊ����֮��
	private static void twoAdd(int n){
		for(int i=2;i<n/2+1;i++){
			if(isPrime(i)&&isPrime(n-i)){
				System.out.println(n+"="+(i)+"+"+(n-i));
				break;
			}
		}
	}
	//�ж�����
	private static boolean isPrime(int m){
		boolean flag = true;
		for(int i=2;i<Math.sqrt(m)+1;i++){
			if(m%i==0){
				flag = false;
				break;
			}
		}
		return flag;
	}
}
