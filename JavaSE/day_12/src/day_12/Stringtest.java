package day_12;

public class Stringtest {
	public static void main(String[] args) {
		int[] arr= {1,2,1,2};
		String b = ArrarToString(arr);
		System.out.println(b);
	}

	public static String ArrarToString(int[] arr) {
		String s = "[";

		for (int a = 0; a < arr.length; a++) {
			if (a == arr.length - 1) {
				s += arr[a];
				s += "]";
			} else {
				s += arr[a];
				s += ", ";
			}

		}
		return s;

	}
}
