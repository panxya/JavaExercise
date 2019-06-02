package d07_02big_number;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * This program uses big numbers to compute the odds of winning the grand prize in a lottery.
 * @author ะกั๎
 * @version V1.1
 */
public class LotteryDemo1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("How many number do you need to draw?");
		int k = in.nextInt();
		
		System.out.println("What is the bigest number you can draw?");
		int n = in.nextInt();
		
		/*
		 * compute binomial coefficient 
		 */
		
		BigInteger lotteryOdds = BigInteger.valueOf(1);
		
		for(int i =1;i<=k;i++) {
			lotteryOdds = lotteryOdds.multiply(BigInteger.valueOf(n-i+1))
					.divide(BigInteger.valueOf(i));
			}
		System.out.println("Your odds are 1 in "+lotteryOdds
				+".Good luck!");	
		}
	}

