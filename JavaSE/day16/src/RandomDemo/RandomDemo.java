package RandomDemo;

import java.util.ArrayList;
import java.util.Random;

/*
 * Ҫ�����10��0-100�������
*/
public class RandomDemo {
	public static void main(String[] args) {
		Random r = new Random();

		ArrayList<Integer> array = new ArrayList<Integer>();

		int count = 0;

		while (count < 10) {
			int a = r.nextInt(100) + 1;
			if (!array.contains(a)) {
				count++;
				array.add(a);
			}
		}

		for (Integer b : array) {
			System.out.println(b);
		}
	}
}
