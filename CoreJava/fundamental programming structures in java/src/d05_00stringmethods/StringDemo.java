package d05_00stringmethods;

public class StringDemo {
	public static void main(String[] args) {
	//字符串裁剪
		String s = "HelloWorld";
		String a = s.substring(5,7);
		System.out.println(a);
	//字符串拼接1
		String a1 = String.join("a", "/o","p","0");///oapa0
		String a2 = String.join("a", "s","p","0");// 第一个为分隔符
		String all = String. join(" / ", "S", "M", "L", "XL");
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(all);
		
	//字符串拼接2
		String b = "Hello";
		String b1 = "World";
		String b2 = b.concat(b1);
		System.out.println(b2);
	//字符串拼接3 +修改
		String c = "Hella";
		System.out.println(c.substring(0,4)+"o");
	//字串相等
		String d1 = "Hello";
		String d2 = "Hello";
		System.out.println(d1.equals(d2));
	//获取码点数量
		int cpCount = s. codePointCount(0, s.length());
		char first = s. charAt(1);
		System.out.println(cpCount);
		System.out.println(first);
		
	//要想得到第 i 个码点， 应该使用下列语句
		int index = s. offsetByCodePoints(0,1);
		int cp = s. codePointAt(index);
		System.out.println(cp);
	}
}
