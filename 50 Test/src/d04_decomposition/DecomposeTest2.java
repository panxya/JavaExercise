package d04_decomposition;

public class DecomposeTest2 {
	public static void main(String[] args) {
		int n = 99;
		decompose(n);
	}

	private static void decompose(int n) {
		for(int i = 2;i<n;i++) {
			while(i%n == 0&&i!=n) {
				i/=n;
				System.out.print(n+"*");
			}
			if(i==n) {
				System.out.print(i);
				break;
			}
		}
		
	}
}
