package d37_delete_game;

import java.util.Scanner;

public class Answer {
	public static void main(String[] args){
		System.out.print("������һ��������");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		
		//�������������ʶĳ���Ƿ���Ȧ��
		boolean[] isIn = new boolean[n];
		
		for(int i=0;i<isIn.length;i++)
		  isIn[i] = true;
		//����Ȧ������������������
		int inCount = n;//����Ȧ������
		int countNum = 0;//���屨��
		int index = 0;//��������
		while(inCount>1){
			if(isIn[index]){
				countNum++;
				if(countNum==3){
					countNum = 0;
					isIn[index] = false;
					inCount--;
				}
			}
			index++;
			
			if(index==n)////�����������֮���ٴ�ͷ��ʼ
			  index = 0;
		}
		for(int i=0;i<n;i++)
		  if(isIn[i])
		    System.out.println("���µ��ǣ�"+i);
	}

}
