package d05_01stringmethods;

public class MethodsDemo {
	public static void main(String[] args) {
		String s = "HelloWorldJava";
		//return the code unit at index "0".
		char a = s.charAt(0);
		System.out.println(a);
		
		//返回索引1的代码点
		int b = s.codePointAt(1);
		System.out.println(b);
		
		//索引从开始处后移1位的代码点索引
		int c = s.offsetByCodePoints(0, 2);
		System.out.println(c);
		
		//比较两个字符串
		int d = s.compareTo("HelloJava");
		System.out.println(d);
		
		//得到代码点数组
		int[] arr = s.codePoints().toArray();
		for(int x =0;x<arr.length;x++) {
			System.out.print(arr[x]+",");
		}
		System.out.println();
		
		//比较忽略大小写的
		System.out.println(s.equalsIgnoreCase("helloworld"));
		
		//返回索引值
		int e = s.indexOf("J");
		System.out.println(e);
		
		
		
		
	}
}
