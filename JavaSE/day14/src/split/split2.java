package split;

import java.util.Arrays;

public class split2 {
	public static void main(String[] args) {
		String a = "11 23 45 75 33 56";

		String[] arr = a.split(" ");

		int[] arr1 = new int[arr.length];
//String תint
		for (int x = 0; x < arr.length; x++) {
			arr1[x] = Integer.parseInt(arr[x]);
		}
//����
		Arrays.sort(arr1);
//��ӿո���Ԫ��
		StringBuilder sb = new StringBuilder();
		for (int y = 0; y < arr1.length; y++) {
			sb.append(arr1[y]).append(" ");
		}
//Stringbuilder to String	
		String b = sb.toString().trim();
		System.out.println(b);

	}
}
