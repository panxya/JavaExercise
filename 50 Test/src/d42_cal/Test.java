package d42_cal;

/*809*??=800*??+9*??+1 
����??�������λ��
,8*??�Ľ��Ϊ��λ����
9*??�Ľ��Ϊ3λ����
��??�������λ������809*??��Ľ����
*/
public class Test {
	public static void main(String[] args) {
		int n = 0;
		boolean flag = false;
		for (int i = 10; i < 100; i++) {
			if (i * 809 == 800 * i + 9 * i + 1) {
				flag = true;
				n = i;
			}
		}

		if (flag) {
			System.out.println(n);
		} else {
			System.out.println("without it");
		}

	}
}
