package d35_swap_array;

import java.util.Arrays;
import java.util.Scanner;

//输入数组，
//最大的与第一个元素交换，
//最小的与最后一个元素交换，输出数组。
/*找到该数组的最大值和最小值

     * 找到该数组最大项把它和第一位交换，

     * 找到该数值的最小项把它和最后一项交换

     * 这里有一点值得注意：不能把最大值和最小值先找出来，再连续执行两次操作交换，会出错！

     * 还有一点要注意：没叫到要交换的数值的位置不变，我在网上查了的都会有乱序的
     * * 用最大值下标交换第一个
   * 再用最小值下标交换第二个
*/
public class test {
	public static void main(String[] args) {
		System.out.println("输入数组 空格隔开");
		Scanner sc = new Scanner(System.in).useDelimiter("\\s");
		int[] A = new int[50];
		int m = 0;
		//获取输入的数字
		while(sc.hasNextInt()) {
			A[m++] = sc.nextInt();
		}
		sc.close();
		
		int[] B = new int[m];
		//创建新数组储存
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
		
		//下标
		int max1 = 0;
		int min1 = 0;
		//最大值
		for(int i = 0 ;i<B.length;i++) {
			if(max == B[i]) {
				max1 = i;
			}
		}
		int temp = 0;
		temp = B[0];
		B[0]=B[max1];
		B[max1]=temp;
		
		//最小值
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
