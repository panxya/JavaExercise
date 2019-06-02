package d03narcissistic_number;
/*
 * 打印出所有的"水仙花数"，所谓"水仙花数"是指一个三位数，
 * 其各位数字立方和等于该数本身。
 * 例如：153是一个"水仙花数"，因为153=1的三次方＋5的三次方＋3的三次方。 
	程序分析：利用for循环控制100-999个数，每个数分解出个位，十位，百位。
 * 
 * */
public class NarcissisticTest {
	public static void main(String[] args) {
		int count = 0;
		
		
		for(int x = 100;x<1000;x++) {
			int bai = (int)x/10/10;
			int shi = (int)(x-bai*10*10)/10;
			int ge  = x-bai*10*10-shi*10;
			int num = ge*ge*ge+shi*shi*shi+bai*bai*bai;
			if(x == num) {
				System.out.println(x);
			}
		}
	}
}
