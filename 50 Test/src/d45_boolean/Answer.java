package d45_boolean;

import java.util.Scanner;
//��Ŀ���ж�һ�������ܱ�����9����
public class Answer {
	public static void main(String[] args){
		System.out.print("������һ������");
	  Scanner scan = new Scanner(System.in);
	  long l = scan.nextLong();
	  
	  long n = l;
	  scan.close();
	  
	  int count = 0;
	 
	  while(n>8){
		  n /= 9;
		  count++;
	  }
	  System.out.println(l+"�ܱ�"+count+"��9������");
	}

}
