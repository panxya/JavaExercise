package d07_01lottery;

import java.util.Scanner;

/**
 * This program demonstrates a <code>for</code> loop.
 * @author ะกั๎
 * @version V1.0
 */
public class LotteryOdds {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("How many numbers do you need to draw?");
		int k = in.nextInt();
		
		System.out.println("What is the highest number youcan draw?");
		int n = in.nextInt();
		
		/*
		 * compute binomial coeffcient n*(n-1)*(n-2)*...*(n-k+1)/(1*2*3...*k)
		 */
		int lotteryOdds = 1;
		for(int i = 1;i<=k;i++) 
			lotteryOdds *= (n-i+1)/i;
		
		System.out.println("Your odds are 1 in "+lotteryOdds
				+".Good luck!");
			
		
	}
}
