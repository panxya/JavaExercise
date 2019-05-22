package d12_reward;

import java.util.Scanner;

public class RewardTest2 {
	public static void main(String[] args) {
		System.out.println("Enter your profit.");
	Scanner sc = new Scanner(System.in);
	double profit = sc.nextDouble();
	double sum = 0;
	double profit_sub = profit;
	if(profit>1000000) {
		sum += (profit-1000000)*0.01;
		profit_sub = 1000000;
		profit = profit-1000000;
	}
	
	if(profit>600000) {
		sum += (profit_sub-600000)*0.015;
		profit_sub = 600000;
		profit = profit-600000;
		
	}
	
	if(profit>400000) {
		sum += (profit_sub-400000)*0.03;
		profit_sub = 400000;
		profit = profit-400000;
	}
	
	if(profit>200000) {
		sum += (profit_sub-200000)*0.05;
		profit_sub = 200000;
		profit = profit-200000;
	}
	
	if(profit>100000) {
		sum += (profit_sub-100000)*0.075;
		profit_sub =100000;
		profit = profit-100000;
	} 
	
		
	sum += profit_sub*0.1;
		
	
	System.out.println("Ó¦·¢½±½ð"+sum);
	sc.close();
}

	}
	

