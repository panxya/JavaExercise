package d44_divide_prime_sum;

//一个偶数总能表示为两个素数之和。

public class Test {
	public static void main(String[] args) {
		int a = (int)(Math.random()*100);
		if (a % 2 != 0) {
			return;
		}
		System.out.println(a);
		twoAdd(a);
	}

	private static void twoAdd(int n) {
		for (int i = 2; i < n / 2 + 1; i++) {
			if (isPrime(i) && isPrime(n - i)) {
				System.out.println(n + "=" + (i) + "+" + (n - i));
				break;
			}
		}

	}

	private static boolean isPrime(int i) {
		boolean flag = true;
		for (int j = 2; j < Math.sqrt(i) + 1; j++) {
			if (i % j == 0) {
				flag = false;
				break;
			}
		}
		return flag;
	}
}