package d05_02stringbuilder;

public class StringBuilderDemo {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
	//添加字符串
		sb.append("Hello");
		System.out.println(sb);
	//	添加char
		sb.append('W');
		System.out.println(sb);
	//	在第五位取代原char
		sb.setCharAt(5, 'a');
		System.out.println(sb);
	//	在第五位插入
		sb.insert(5, 'J');
		System.out.println(sb);
	//	在第六位插入字符串
		sb.insert(6, "av");
		System.out.println(sb);
	//	删除字串
		sb.delete(5, 9);
		System.out.println(sb);
	//	转换为字符串
		System.out.println(sb.toString());
		
	}
}
