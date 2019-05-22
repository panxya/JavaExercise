package cn.arrcopy04;

import java.util.Arrays;

public class arrcopyDemo {
	public static void main(String[] args) {
		int[] arr1 = {11,22,33,44,55};
		int[] arr2 = {5,6,7,8,9,10};
		
		
		System.arraycopy(arr1, 1, arr2, 2, 2);
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
	}
}
