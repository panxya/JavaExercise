package d11_count;

/*��1��2��3��4�����֣�
 * ����ɶ��ٸ�������ͬ�����ظ����ֵ���λ����
 * ���Ƕ��٣�
��������������ڰ�λ��ʮλ����λ�����ֶ���1��2��3��4��
������е����к���ȥ �����������������С�
*/
public class CountTest {
	public static void main(String[] args) {
		int count = 0;
		int sum = 0;
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j < 5; j++) {
				if (i == j) {
					continue;
				}

				for (int k = 1; k < 5; k++) {
					if (!(i == k) && !(j == k)) {
						sum = i * 100 + j * 10 + k;
						System.out.print(sum+" ");
						if((++count)%5==0) {
							//if�ж�Ҳ�ı���count��ֵ
							System.out.println();
						}
					}
				}
			}
		}
		System.out.println("��"+count+"��");
	}
}
