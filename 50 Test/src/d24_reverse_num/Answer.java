package d24_reverse_num;

import java.util.Scanner;

//���� do while
public class Answer {
	public static void main(String[] args) {
		System.out.println("������һ��������5λ�������֣�");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();// ��ȡ����
		int[] arr = new int[5];// ����5λ��������
		int i = 0;
		// ѭ��ȡλ
		do {
			arr[i] = num % 10;
			num = num / 10;
			i++;
		} while (num != 0);// ֻʣ��һλʱ��˵����ȡ��ϣ�����ѭ��
		System.out.println("�������ִ�����" + i + "λ����");
		System.out.println("���������");
		// ��ӡ������ ��������ʱ�Ѿ�������
		for (int j = 0; j < i; j++) {
			System.out.print(arr[j] + "  ");
		}
		scanner.close();
		}
}
