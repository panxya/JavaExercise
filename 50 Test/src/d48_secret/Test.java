package d48_secret;

import java.util.Arrays;

/*某个公司采用公用电话传递数据，数据是四位的整数，在传递过程中是加密的，加密规则如下：
 * 每位数字都加上5,
 * 然后用和除以10的余数代替该数字，
 * 再将第一位和第四位交换，
 * 第二位和第三位交换。*/
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
