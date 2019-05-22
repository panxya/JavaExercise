package d05_01stringmethods;

public class MethodsDemo {
	public static void main(String[] args) {
		String s = "HelloWorldJava";
		//return the code unit at index "0".
		char a = s.charAt(0);
		System.out.println(a);
		
		//��������1�Ĵ����
		int b = s.codePointAt(1);
		System.out.println(b);
		
		//�����ӿ�ʼ������1λ�Ĵ��������
		int c = s.offsetByCodePoints(0, 2);
		System.out.println(c);
		
		//�Ƚ������ַ���
		int d = s.compareTo("HelloJava");
		System.out.println(d);
		
		//�õ����������
		int[] arr = s.codePoints().toArray();
		for(int x =0;x<arr.length;x++) {
			System.out.print(arr[x]+",");
		}
		System.out.println();
		
		//�ȽϺ��Դ�Сд��
		System.out.println(s.equalsIgnoreCase("helloworld"));
		
		//��������ֵ
		int e = s.indexOf("J");
		System.out.println(e);
		
		
		
		
	}
}
