package d19_rhombus;

/*���� a�� 6 b�� 12
 * �ж�˼��*/
public class RhombusTest {
	public static void main(String[] args) {
		int a = 6;
		// ��������
		for (int i = 0; i < a; i++) {//��
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
		// ��������
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
