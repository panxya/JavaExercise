package day_12;
/*
 * 
 * 统计变量
 * 查找位置
 * 	索引-1 返回统计变量
 *  索引不是则统计变量==
 * 索引+长度位置再次截取新字符串 后返回
 * 返回查找
 * 
*/
public class Stringtest2 {
	public static void main(String[] args) {
		String big = "sishisishisishisishishisishishisishishisi";
		String small = "si";
		
		int c = CountString(big,small);
		System.out.println(c);
		
	}
	
	public static int CountString (String big,String small) {
		int x = 0;
		//查找
		int index = big.indexOf(small);
		
		while(index != -1) {
			x++;
			//小串+索引  重新定义大串
			int s = index+small.length();
			big = big.substring(s);
			//查找
			index = big.indexOf(small);
			
		}
		return x;
	}
}
