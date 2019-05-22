package d04_decomposition;
/*
 * 题目：将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5。
 * 分析：
 * 	输入num=90
 * 一直循环下三步 知道num=1
 *  90/2 = 45 余数为0
 *   输出2
 *   +1
 *   
 *   完善的加一个质数判断
 *   裁掉最后一个*
 * */

public class DecompositionTest {
	public static void main(String[] args) {
//输入num=90
		int num = 90;

		String s = toDecomposition(num);
		System.out.println(s);
	}

	private static String toDecomposition(int num) {
		String s = "";
		//一直循环，直到num=1
		wc: while (true) {
			for (int n = 2; n <= num; n++) {
				//等于0则添加
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
