package d05_00stringmethods;

public class StringDemo {
	public static void main(String[] args) {
	//�ַ����ü�
		String s = "HelloWorld";
		String a = s.substring(5,7);
		System.out.println(a);
	//�ַ���ƴ��1
		String a1 = String.join("a", "/o","p","0");///oapa0
		String a2 = String.join("a", "s","p","0");// ��һ��Ϊ�ָ���
		String all = String. join(" / ", "S", "M", "L", "XL");
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(all);
		
	//�ַ���ƴ��2
		String b = "Hello";
		String b1 = "World";
		String b2 = b.concat(b1);
		System.out.println(b2);
	//�ַ���ƴ��3 +�޸�
		String c = "Hella";
		System.out.println(c.substring(0,4)+"o");
	//�ִ����
		String d1 = "Hello";
		String d2 = "Hello";
		System.out.println(d1.equals(d2));
	//��ȡ�������
		int cpCount = s. codePointCount(0, s.length());
		char first = s. charAt(1);
		System.out.println(cpCount);
		System.out.println(first);
		
	//Ҫ��õ��� i ����㣬 Ӧ��ʹ���������
		int index = s. offsetByCodePoints(0,1);
		int cp = s. codePointAt(index);
		System.out.println(cp);
	}
}
