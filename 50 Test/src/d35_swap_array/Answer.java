package d35_swap_array;

import java.util.Arrays;
import java.util.Scanner;
//�Ѿ��ı�˳���˵�
public class Answer {

	public static void main(String[] args) {
		System.out.print("������һ������");
		Scanner scan = new Scanner(System.in).useDelimiter("\\s");
		int[] a = new int[50];
		int m = 0;
		while (scan.hasNextInt()) {
			a[m++] = scan.nextInt();
		}
		scan.close();
		int[] b = new int[m];
		for (int i = 0; i < m; i++)
			b[i] = a[i];
		for (int i = 0; i < b.length; i++)
			for (int j = 0; j < b.length - i - 1; j++)
				if (b[j] < b[j + 1]) {
					int temp = b[j];
					b[j] = b[j + 1];
					b[j + 1] = temp;
				}
		for (int i = 0; i < b.length; i++)
			System.out.print(b[i] + " ");

	}

}
