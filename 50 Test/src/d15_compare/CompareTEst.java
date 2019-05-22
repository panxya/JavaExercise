package d15_compare;

import java.util.Arrays;
import java.util.Scanner;

/*输入三个整数x,y,z，请把这三个数由小到大输出。*/
public class CompareTEst {
	public static void main(String[] args) {
		System.out.println("输入三个数字");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		int[] arr = new int[3];
		arr[0] = x;
		arr[1] = y;
		arr[2] = z;
		Arrays.sort(arr);
		System.out.print(Arrays.toString(arr));
		
	}
}
