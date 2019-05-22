package d02_prime_number;

public class PrimeTest2 {
	public static void main(String[] args) {

		int n = 1;
		int m = 1000;
		int count = 0;
		for (int i = n; i <= m; i++) {
			if (isPrime(i)) {
				count++;
				System.out.printf("%4d", i);
				if (count % 10 == 0) {
					System.out.println();
				}
			}
		}
		System.out.println();
		System.out.println("1-1000中共有质数" + count + "个");
	}

	private static boolean isPrime(int m) {

		boolean flag = true;
		if (m == 1) {
			flag = false;
		} else {
			for (int j = 2; j <= Math.sqrt(m); j++) {
				if ((m % j) == 0||m==1) {
					flag = false;
					break;
				} else {
					flag = true;
				}
			}
		}
		return flag;
	}
}
