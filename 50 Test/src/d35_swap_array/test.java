package d35_swap_array;

import java.util.Arrays;
import java.util.Scanner;

//�������飬
//�������һ��Ԫ�ؽ�����
//��С�������һ��Ԫ�ؽ�����������顣
/*�ҵ�����������ֵ����Сֵ

     * �ҵ����������������͵�һλ������

     * �ҵ�����ֵ����С����������һ���

     * ������һ��ֵ��ע�⣺���ܰ����ֵ����Сֵ���ҳ�����������ִ�����β��������������

     * ����һ��Ҫע�⣺û�е�Ҫ��������ֵ��λ�ò��䣬�������ϲ��˵Ķ����������
     * * �����ֵ�±꽻����һ��
   * ������Сֵ�±꽻���ڶ���
*/
public class test {
	public static void main(String[] args) {
		System.out.println("�������� �ո����");
		Scanner sc = new Scanner(System.in).useDelimiter("\\s");
		int[] A = new int[50];
		int m = 0;
		//��ȡ���������
		while(sc.hasNextInt()) {
			A[m++] = sc.nextInt();
		}
		sc.close();
		
		int[] B = new int[m];
		//���������鴢��
		for(int i = 0;i<B.length;i++) {
			B[i]=A[i];
		}
		System.out.println(Arrays.toString(B));
		
		int max = 0;
		int min = B[0];
		
		for(int i = 0;i<B.length;i++) {
			if(B[i]<=min) {
				min = B[i];
			}
			if(B[i]>max) {
				max = B[i];
			}
		}
		
		//�±�
		int max1 = 0;
		int min1 = 0;
		//���ֵ
		for(int i = 0 ;i<B.length;i++) {
			if(max == B[i]) {
				max1 = i;
			}
		}
		int temp = 0;
		temp = B[0];
		B[0]=B[max1];
		B[max1]=temp;
		
		//��Сֵ
		for(int i = 0 ;i<B.length;i++) {
			if(min == B[i]) {
				min1 = i;
			}
		}
		int temp1 = 0;
		temp1 = B[B.length-1];
		B[B.length-1]=B[min1];
		B[min1]=temp1;
		
		System.out.println(Arrays.toString(B));
	}
}
