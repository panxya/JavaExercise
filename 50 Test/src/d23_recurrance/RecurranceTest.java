package d23_recurrance;

/*��5��������һ��
 * �ʵ�����˶����ꣿ��˵�ȵ�4���˴�2�ꡣ
 * �ʵ�4������������˵�ȵ�3���˴�2�ꡣ
 * �ʵ������ˣ���˵�ȵ�2�˴����ꡣ
 * �ʵ�2���ˣ�˵�ȵ�һ���˴����ꡣ
 * ����ʵ�һ���ˣ���˵��10�ꡣ
 * ���ʵ�����˶�� 
������������õݹ�ķ�����
�ݹ��Ϊ���ƺ͵��������׶Ρ�
Ҫ��֪�����������������֪�������˵�������
�������ƣ��Ƶ���һ�ˣ�10�꣩���������ơ�

 * */
public class RecurranceTest {
	public static void main(String[] args) {
	System.out.println(getAge(5,2));
	
	
	}

	private static int getAge(int i, int j) {
		
		if(i ==1) {
			return 10;
		}else {
			return getAge(i-1,j)+j;
		}
		
	}
}
