package d27_primenum;

public class test {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 2; i <= 100; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
				count ++;
				if(count%5==0) {System.out.println();}
			}
		}
		System.out.println();
		System.out.println("¹²"+count+"¸ö");
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