package day_12;

public class StringClass2 {
	public static void main(String[] args) {

		String x = "ddddssseegĞĞ";
		String a = myReverse(x);
		System.out.println("·­×ª£º" + a);
	}

	public static String myReverse(String s) {

		String result = "";

		char[] chs = s.toCharArray();

		for (int x = chs.length - 1; x >= 0; x--) {
			result += chs[x];

		}
		return result;
	}

}
