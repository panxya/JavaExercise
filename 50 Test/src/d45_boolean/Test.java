package d45_boolean;

public class Test {
	public static void main(String[] args) {
		long l = (long) (Math.random() * 100000);
		int count = 0;
		System.out.println(l);
		while (l > 8) {
			l /= 9;
			count++;
		}
	
	System.out.println(count);
	}
}
