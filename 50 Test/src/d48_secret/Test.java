package d48_secret;

import java.util.Arrays;

/*ĳ����˾���ù��õ绰�������ݣ���������λ���������ڴ��ݹ������Ǽ��ܵģ����ܹ������£�
 * ÿλ���ֶ�����5,
 * Ȼ���úͳ���10��������������֣�
 * �ٽ���һλ�͵���λ������
 * �ڶ�λ�͵���λ������*/
public class Test {
	public static void main(String[] args) {
		int a = 1923;
		int[] arr = new int[4];
		for(int i = 0;i<arr.length;i++) {
			arr[i]= a/(int)(Math.pow(10, (arr.length-i-1)));
			arr[i]+=5;
			arr[i]%=10;
		}
		int temp = 0 ;
		temp = arr[0];
		arr[0]=arr[3];
		arr[3]=temp;
		
		temp = arr[1];
		arr[1]=arr[2];
		arr[2]=temp;
		System.out.println(Arrays.toString(arr));
	}
}
