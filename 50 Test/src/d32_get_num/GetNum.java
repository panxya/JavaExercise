package d32_get_num;

/*
 * 取一个整数a从右端开始的4～7位。
程序分析：可以这样考虑：
(1)先使a右移4位。
(2)设置一个低4位全为1,其余全为0的数。可用~(~0<<4)
(3)将上面二者进行&运算。
*/
public class GetNum {
	public static void main(String[] args) {
		int a = 1112039400;
		String s = String.valueOf(a);
		char[] chs = s.toCharArray();
		int l = chs.length;
		System.out.println(chs[l-7]+" "+chs[l-6]+" "+chs[l-5]+" "+chs[l-4]+" ");
		
	}
}
