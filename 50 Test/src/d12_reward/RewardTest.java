package d12_reward;

import java.util.Scanner;

/*��ҵ���ŵĽ������������ɡ�
 * ����(I)���ڻ����10��Ԫʱ���������10%��
 * �������10��Ԫ������20��Ԫʱ������10��Ԫ�Ĳ��ְ�10%��ɣ�
 * ����10��Ԫ�Ĳ��֣��ɿ����7.5%��
 * 20��40��֮��ʱ������20��Ԫ�Ĳ��֣������5%��
 * 40��60��֮��ʱ����40��Ԫ�Ĳ��֣������3%��
 * 60��100��֮��ʱ������60��Ԫ�Ĳ��֣������1.5%������100��Ԫʱ��
 * ����100��Ԫ�Ĳ��ְ�1%��ɣ��Ӽ������뵱������I����Ӧ���Ž��������� */
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
		}//100-60=40   profit = 40����  ����==��60
		
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
			
		
		System.out.println("Ӧ������"+sum);
		sc.close();
	}
	
}
//ʧ��