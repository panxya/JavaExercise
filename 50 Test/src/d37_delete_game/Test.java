package d37_delete_game;

import java.util.Scanner;

/*����n����Χ��һȦ��˳���źš��ӵ�һ���˿�ʼ��������1��3��������
 * ������3�����˳�Ȧ�ӣ���������µ���ԭ���ڼ��ŵ���λ��

�ؼ���������ô�Ƴ�����:
����ֵȷ���������ѡ�б���ֵΪfalse
     * �ӵ�һ���˿�ʼ�жϣ�
     * �������Ȧ�ڣ���ô������
     * ���ж����������Ƿ���3������ǵĻ��Ƴ�Ȧ��
     * �����ж���һ���ˣ�
     * �Ƿ�����ĩ��
     * ����ǵĻ���
     * ���㿪ʼ
     * ����ѭ����
     * ֱ�����ʣ��1����
*/
public class Test {
	public static void main(String[] args) {
		int n = (int) (Math.random() * 1000);
		System.out.println("����" + n);
		boolean[] A = new boolean[n];
		for (int i = 0; i < A.length; i++) {
			A[i] = true;
		}
		int count = 0;
		int inCount = n;
		int index = 0;
		while (inCount > 1) {
			if (A[index]) {
				count++;
				if (count == 3) {
					count = 0;
					A[index] = false;
					inCount--;
				}
			}
			index++;
			if (index == n) {
				index = 0;
			}
		}
		
		for (int i = 0; i < n; i++) {
			if (A[i]) {
				System.out.println("����" + i);
			}
		}

	}
}
