package d08_00arrays;

import java.util.Arrays;

public class EachDemo {
	public static void main(String[] args) {
		int[] arr = {112,11,55,21,67,222,666};
		//��������1
		System.out.println(Arrays.toString(arr));
		//��������2
		for(int a :arr) {
			System.out.print(a+",");
		}
	}
}
