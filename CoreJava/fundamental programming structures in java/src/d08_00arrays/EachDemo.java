package d08_00arrays;

import java.util.Arrays;

public class EachDemo {
	public static void main(String[] args) {
		int[] arr = {112,11,55,21,67,222,666};
		//遍历方法1
		System.out.println(Arrays.toString(arr));
		//遍历方法2
		for(int a :arr) {
			System.out.print(a+",");
		}
	}
}
