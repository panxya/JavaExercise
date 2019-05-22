package d07_count;

import java.util.Scanner;

/*这只是方式一 answer方式二采用ArrayList
 * 输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。
程序分析：利用while语句,条件为输入的字符不为'\n'.

*/
public class CountTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
	
		count(s);
		sc.close();
	}

	private static void count(String s) {

		int engCount = 0;
		int numCount = 0;
		int spaceCount = 0;
		int otherCount = 0;

		//通过索引值获取每一个字符 再用正则表达式进行对比
		//每个字符串只有一个值
		for (int i = 0; i < s.length()-1; i++) {
			String ss = String.valueOf(s.charAt(i));
			if (ss.matches("[a-zA-Z]")) {
				engCount++;
			} else if (ss.matches("\\d")) {
				numCount++;
			} else if (ss.matches("\\s")) {
				spaceCount++;
			} else {
				otherCount++;
			}
		}

		System.out.println("字母数为：" + engCount + "，数字数为：" + numCount + "，空格数为：" + spaceCount + "，其他数为：" + otherCount);
	}

}
