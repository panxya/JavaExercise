package d13_cal;

/*һ��������������100����һ����ȫƽ������
 * �ټ���168����һ����ȫƽ������
 * ���ʸ����Ƕ��٣�

�����������10�������жϣ�

     ��forѭ���жϣ��Ƚ���������100���ٿ�����
     �ٽ���������268���ٿ�����
     ���������Ľ����ƽ����ֱ��i+100,
     i+268��ȣ����ǽ���� 
*/
public class CalaulationTest {
	public static void main(String[] args) {
		for (int i = 0; i < 10000; i++) {
			int num1 = (int) Math.sqrt(i + 100);
			int num2 = (int) Math.sqrt(i + 268);
			if ((num1 * num1 == (i + 100) )&& (num2 * num2 == (i + 268))) {
				System.out.println(i);
			}
			
			

		          
		}
	}

}
