package d05_02stringbuilder;

public class StringBuilderDemo {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
	//����ַ���
		sb.append("Hello");
		System.out.println(sb);
	//	���char
		sb.append('W');
		System.out.println(sb);
	//	�ڵ���λȡ��ԭchar
		sb.setCharAt(5, 'a');
		System.out.println(sb);
	//	�ڵ���λ����
		sb.insert(5, 'J');
		System.out.println(sb);
	//	�ڵ���λ�����ַ���
		sb.insert(6, "av");
		System.out.println(sb);
	//	ɾ���ִ�
		sb.delete(5, 9);
		System.out.println(sb);
	//	ת��Ϊ�ַ���
		System.out.println(sb.toString());
		
	}
}
