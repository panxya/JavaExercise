package d13_cal;

public class Answer2 {
	public static void main(String[] args) {
		int n = 0;
		for (int i = 0; i < 100001; i++) {
			if (isCompSqrt(i + 100) && isCompSqrt(i + 268)) {
				n = i;
				break;
			}
		}
		System.out.println("��������ǣ�" + n);
	}

	// �ж���ȫƽ����
	private static boolean isCompSqrt(int n) {
		boolean isComp = false;
		for (int i = 1; i < Math.sqrt(n) + 1; i++) {
			if (n == Math.pow(i, 2)) {
				isComp = true;
				break;
			}
		}
		return isComp;
	}

}
