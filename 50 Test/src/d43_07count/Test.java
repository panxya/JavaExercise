package d43_07count;
/*����Ҳ��1λ������������8λ������ 

 *       ��һλ����Ϊ�㣬���һλ������ż��

 * 0��7���ĸ�����

 *       �������ۼ����

*/
public class Test {
	public static void main(String[] args) {
		int count = 0;
		// ������������ɵ���
		int n = 8;
		// һλ��
		count = n / 2;
		// ��λ��
		count += (n - 1) * n / 2;
		// ��λ��
		count += (n - 1) * n * n / 2;
		// ��λ��
		count += (n - 1) * n * n * n / 2;
		// ��λ��
		count += (n - 1) * n * n * n * n / 2;
		// ��λ��
		count += (n - 1) * n * n * n * n * n / 2;
		// ��λ��
		count += (n - 1) * n * n * n * n * n * n / 2;
		System.out.println("0-7������ɵ�����������" + count);
	}

}
