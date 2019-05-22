package day_12;
/*
 * 键盘录入字符串   数大写 小写 数字数
 * 
 * 录入
 * 定义统计变量
 * 遍历
 * 判断
 * 
*/

import java.util.Scanner;

public class CountDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("录入字符串");
		String a = sc.nextLine();
//统计量
		int bigcount = 0;
		int smallcount = 0;
		int numcount = 0;
//遍历
		for(int x = 0;x<a.length();x++) {
			char ch = a.charAt(x);	
//判断			
			if(ch>= 'a'&&ch<='z') {
				smallcount++;
			}else if(ch>= 'A'&&ch<='Z'){
				bigcount++;
			
			}else if(ch>= '0'&&ch<='9'){
				numcount++;
			}
		}
		System.out.println("大写字母数："+bigcount);
		System.out.println("小写字母数："+smallcount);
		System.out.println("数字数："+numcount);
		sc.close();
	}
}




