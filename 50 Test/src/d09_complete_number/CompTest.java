package d09_complete_number;

/*
 * 一个数如果恰好等于它的因子之和，这个数就称为"完数"。
 * 例如6=1＋2＋3.编程找出1000以内的所有完数。*/
public class CompTest {
	public static void main(String[] args) {
		// 1-1000中寻找
		for (int i = 1; i <= 10000; i++) {
			int sum = 0;
			// 为每位数字寻找因数
				for (int j = 1; j <= i/2+1; j++) {	
					if (i % j == 0) {
						sum += j;
					}
					// 判断和
					if (sum == i) {
						System.out.println(sum);
						break;
					}
				}
		}
	}
}
