package d03narcissistic_number;

public class NarcissisticTest2 {
	public static void main(String[] args) {
		for (int n = 100; n < 1000; n++) {
			if (isNarcissistic(n)) {
				System.out.print(n + " ");
			}
		}
	}

	private static boolean isNarcissistic(int num) {
		int m = 0;
		int n = num;
		int sum = 0;

		m = n / 100;
		sum = m * m * m;
		n -= m * 100;
		m = n / 10;
		n -= m * 10;
		sum += m * m * m + n * n * n;

		if (sum == num) {
			return true;
		}else {
			return false;
		}


	
	}
}
