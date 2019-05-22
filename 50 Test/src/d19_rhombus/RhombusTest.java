package d19_rhombus;

/*菱形 a长 6 b宽 12
 * 判断思想*/
public class RhombusTest {
	public static void main(String[] args) {
		int a = 6;
		// 上排星星
		for (int i = 0; i < a; i++) {//列
			for (int j = 0; j < 2 * a; j++) {
				if (j < a - i) {
					System.out.print(" ");
				}
				if (j > a - i && j < a + i) {
					System.out.print("*");
				}
			}
			System.out.println();

		}
		// 下排星星
		for (int i = 0; i<a ; i++) {
			for (int j = 0; j < 2 * a; j++) {
				if (j < i) {
					System.out.print(" ");
				}
				if (j >=i && j <2*a-i-1) {
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}
}
