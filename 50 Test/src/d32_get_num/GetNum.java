package d32_get_num;

/*
 * ȡһ������a���Ҷ˿�ʼ��4��7λ��
��������������������ǣ�
(1)��ʹa����4λ��
(2)����һ����4λȫΪ1,����ȫΪ0����������~(~0<<4)
(3)��������߽���&���㡣
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
