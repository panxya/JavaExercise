package Math;

import java.util.Scanner;

public class random {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("第一个");
		int s = sc.nextInt();
		
		System.out.println("第二个");
		int ss = sc.nextInt();
		
		
		for(int x = 0;x<50;x++) {
		int num = getRandom(s,ss);
		System.out.println(num);
	}
}		
	
	public static int getRandom(int s,int ss) {
		
		int num = (int) (Math.random()*(ss-s+1))+s;
		
		return num;
		
		
	}
		
	
}
