/*
����С��Ϸ
1.���������
2.����¼������
3.�������¼��Ա�
    a������
	b��С��
	c����
*/

import java.util.Scanner;
class Game {

	public static void main(String[] args) {
		//���������
		int number = (int)(Math.random()*100)+1;
		//����¼��
		while(true) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("��������µ�1-100�е�һ������");
			int a = sc.nextInt();
			
			if(a>number) {
				System.out.println("��µ�����"+a+"����");
			}else if(a<number) {
				System.out.println("��µ�����"+a+"С��");
			}else{
				System.out.println("����ʿ����������");
				break;
			}

		}	
	
	}

}