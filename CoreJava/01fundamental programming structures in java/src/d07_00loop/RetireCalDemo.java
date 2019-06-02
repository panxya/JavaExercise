package d07_00loop;

import java.util.Scanner;

public class RetireCalDemo {
	public static void main(String[] args) {
		//Input
		Scanner in = new Scanner(System.in);
		
		System.out.println("How much money do you need to retire?");
		double goals = in.nextDouble();
		
		System.out.println("How much money will you contribute every years?");
		double payment = in.nextDouble();
		
		System.out.println("Interest rate in %:");
		double interestRate = in.nextDouble();
		
		double balance = 0;
		int years = 0;
		
		//update account balance while goal isn't reached
		while(balance < goals) {
			//add this year's payment and interest
			balance += payment;
			double interest = balance*interestRate/100;
			balance+=interest;
			years++;
		
		}
		System.out.println("You can retire in "+years+" years." );
	}
}
