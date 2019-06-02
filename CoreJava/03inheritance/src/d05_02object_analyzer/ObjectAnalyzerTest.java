package d05_02object_analyzer;

import java.util.ArrayList;

/**
 * this program uses reflection to spy on objects.
 * @author ะกั๎
 * @version V1.0
 */
public class ObjectAnalyzerTest {
	public static void main(String[] args) {
		ArrayList<Integer> squares = new ArrayList<>();
		for(int i = 1;i<=5;i++) {
			squares.add(i*i);
		}
		System.out.println(new ObjectAnalyzer().toString(squares));
	}
}
