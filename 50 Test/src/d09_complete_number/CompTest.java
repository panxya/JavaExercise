package d09_complete_number;

/*
 * һ�������ǡ�õ�����������֮�ͣ�������ͳ�Ϊ"����"��
 * ����6=1��2��3.����ҳ�1000���ڵ�����������*/
public class CompTest {
	public static void main(String[] args) {
		// 1-1000��Ѱ��
		for (int i = 1; i <= 10000; i++) {
			int sum = 0;
			// Ϊÿλ����Ѱ������
				for (int j = 1; j <= i/2+1; j++) {	
					if (i % j == 0) {
						sum += j;
					}
					// �жϺ�
					if (sum == i) {
						System.out.println(sum);
						break;
					}
				}
		}
	}
}
