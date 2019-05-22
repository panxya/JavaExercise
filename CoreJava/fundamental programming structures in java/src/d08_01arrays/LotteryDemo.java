package d08_01arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * This program demonstrates array manipilation.
 * @author ะกั๎
 * @version V1.2
 */
public class LotteryDemo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("How many number do you need to draw?");
		int k = in.nextInt();
		
		System.out.println("What is the bigest number you can draw?");
		int n = in.nextInt();
	
		//fill an arrays with 123...n
		int[] numbers = new int[n];
		for(int i= 0;i<numbers.length;i++) {
			numbers[i] = i+1;
		}
			
		//draw k numbers and put them into a second array
		int[] result = new int[k];
		for(int i = 0;i<result.length;i++) {
			//make a random index between 0 and n-1
			int r = (int)(Math.random()*n);
			
			//pick element at the random location
			result[i] = numbers[r];
			numbers[r] = numbers[n-1];
			n--;
		}
	//print the sorted array
		Arrays.sort(result);
		System.out.println("Bet that");
		for(int r :result) {
			System.out.println(r);
		}
		
	
	}
}
