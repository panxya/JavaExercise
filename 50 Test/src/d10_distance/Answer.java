package d10_distance;

import java.util.Scanner;

public class Answer {
	public static void main(String[] args){
		System.out.print("������С�����ʱ�ĸ߶Ⱥ����Ĵ�����");
		Scanner scan = new Scanner(System.in).useDelimiter("\\s");
		int h = scan.nextInt();
		int n = scan.nextInt();
		scan.close();
		distance(h,n);
	}
	//С���h�߶����£���n�η����󾭹��ľ���ͷ����ĸ߶�
	private static void distance(int h,int n){
		double length = 0;
		for(int i=0;i<n;i++){
			length += h;
			h /=2.0 ;
		}
		System.out.println("������"+n+"�η�����С�򹲾���"+length+"�ף�"+"��"+n+"�η����߶�Ϊ"+h+"��");
	}

}
