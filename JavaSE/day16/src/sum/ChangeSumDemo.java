package sum;

import java.util.Random;

public class ChangeSumDemo {
	
	public static void main(String[] args) {
		Random r = new Random();
		
		int a = 11;
		int b = 22;
		
		
		int c = r.nextInt(20);
		
		int s = sum(a,b,c);
		
		
		System.out.println(s);
		
	}
	public static int sum(int... a) {
		int s = 0;
		for(int x : a) {
			s += x;
		}
		return s;
	}	
}
