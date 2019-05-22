package d42_cal;

/*809*??=800*??+9*??+1 
其中??代表的两位数
,8*??的结果为两位数，
9*??的结果为3位数。
求??代表的两位数，及809*??后的结果。
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
