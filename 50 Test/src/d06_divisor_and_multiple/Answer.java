package d06_divisor_and_multiple;

import java.util.Scanner;

public class Answer {
	public static void main(String[] args) {
		int bigDivisor = 0;// �������Լ��
		int multiple = 0;// ������С������
		
		System.out.println("����������������");
		Scanner scanner = new Scanner(System.in);
		int input1 = scanner.nextInt();// ��ȡ��һ����
		int input2 = scanner.nextInt();// ��ȡ�ڶ�����
		multiple = input1 * input2;// ���ֵ���棬��Լ���󣬷��������С������
		int temp = 1;// �����õ��м���
		if (input2 > input1) {// ȷ����һ������С�ڵڶ�����
			temp = input1;
			input1 = input2;
			input2 = temp;
		}
		while (temp != 0) { // �������������㣬��һֱѭ��
			temp = input1 % input2;// ������
			input1 = input2;// ������Ѿ�û���ˣ���С�������
			input2 = temp;// ������Ľ����ֵ��С����
		}
		bigDivisor = input1;// ���һ��������Ϊ��ʱ�����������
		multiple = multiple / bigDivisor;
		System.out.println("���Լ���ǣ�" + bigDivisor);
		System.out.println("��С�������ǣ�" + multiple);
		scanner.close();

	}
}
