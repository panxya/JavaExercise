package d04_decomposition;
/*
 * ��Ŀ����һ���������ֽ������������磺����90,��ӡ��90=2*3*3*5��
 * ������
 * 	����num=90
 * һֱѭ�������� ֪��num=1
 *  90/2 = 45 ����Ϊ0
 *   ���2
 *   +1
 *   
 *   ���Ƶļ�һ�������ж�
 *   �õ����һ��*
 * */

public class DecompositionTest {
	public static void main(String[] args) {
//����num=90
		int num = 90;

		String s = toDecomposition(num);
		System.out.println(s);
	}

	private static String toDecomposition(int num) {
		String s = "";
		//һֱѭ����ֱ��num=1
		wc: while (true) {
			for (int n = 2; n <= num; n++) {
				//����0�����
				if (num % n == 0) {
					s += String.valueOf(n) + "*";
					num /= n;
				}
				if (num == 1) {
					break wc;
				}
			}
		}

		s = s.substring(0, s.length() - 1);

		return s;
	}
}
