package d31_reverse_arr;
//：将一个数组逆序输出。
import java.util.Arrays;

public class ReverseTest {
	public static void main(String[] args) {
		int[] arr = {1,2,1,2,2,3,4,5,1,5,7,8,9,0};
		sort(arr);
		System.out.println(Arrays.toString(arr));
		reverse(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void reverse(int[] arr) {
		for(int i = 0;i<(arr.length/2);i++) {
			int temp = arr[i];
			arr[i]=arr[arr.length-i-1];
			arr[arr.length-i-1]=temp;
		}
		
	}

	private static void sort(int[] arr) {
		for(int i =0;i<arr.length;i++) {
			for(int j = 0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]= arr[j+1];
					arr[j+1]= temp;
				}
			}
		}
		
	}
}
