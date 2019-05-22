package d02_prime_number;
/*
 
 * 判断101-200之间有多少个素数，并输出所有素数。
 * 
 * */

public class PrimeNumberTest {
	public static void main(String[] args) {
		int[] array = new int[100];

		for (int i = 0; i < array.length; i++) {
			array[i] = i + 101;
			for (int j = 2; j < i - 1; j++)
				if (array[i] % j == 0) {
					break;
				} else {
					System.out.println(array[i]);
				}
		}

	}
}
