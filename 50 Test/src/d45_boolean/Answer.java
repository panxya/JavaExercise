package d45_boolean;

import java.util.Scanner;
//题目：判断一个素数能被几个9整除
public class Answer {
	public static void main(String[] args){
		System.out.print("请输入一个数：");
	  Scanner scan = new Scanner(System.in);
	  long l = scan.nextLong();
	  
	  long n = l;
	  scan.close();
	  
	  int count = 0;
	 
	  while(n>8){
		  n /= 9;
		  count++;
	  }
	  System.out.println(l+"能被"+count+"个9整除。");
	}

}
