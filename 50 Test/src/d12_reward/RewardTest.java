package d12_reward;

import java.util.Scanner;

/*企业发放的奖金根据利润提成。
 * 利润(I)低于或等于10万元时，奖金可提10%；
 * 利润高于10万元，低于20万元时，低于10万元的部分按10%提成，
 * 高于10万元的部分，可可提成7.5%；
 * 20万到40万之间时，高于20万元的部分，可提成5%；
 * 40万到60万之间时高于40万元的部分，可提成3%；
 * 60万到100万之间时，高于60万元的部分，可提成1.5%，高于100万元时，
 * 超过100万元的部分按1%提成，从键盘输入当月利润I，求应发放奖金总数？ */
public class RewardTest {
	public static void main(String[] args) {
		System.out.println("Enter your profit.");
		Scanner sc = new Scanner(System.in);
		double profit = sc.nextDouble();
		double sum = 0;
	
		if(profit>1000000) {
			sum += (profit-1000000)*0.01;
			profit = profit-1000000;
		}
		
		if(profit>600000) {
			sum += (profit-600000)*0.015;
			profit =600000;
		}//100-60=40   profit = 40才是  这里==了60
		
		if(profit>400000) {
			sum += (profit-400000)*0.03;
			profit =400000;
		}
		
		if(profit>200000) {
			sum += (profit-200000)*0.05;
			profit = 200000;
		}
		
		if(profit>100000) {
			sum += (profit-100000)*0.075;
			profit =100000;
		} 
		
			
		sum += profit*0.1;
			
		
		System.out.println("应发奖金"+sum);
		sc.close();
	}
	
}
//失败