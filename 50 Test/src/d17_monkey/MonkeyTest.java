package d17_monkey;

/*���ӳ������⣺
 * ���ӵ�һ��ժ�����ɸ����ӣ���������һ�룬
 * ����񫣬�ֶ����һ�� 
 * �ڶ��������ֽ�ʣ�µ����ӳԵ�һ�룬�ֶ����һ����
 * �Ժ�ÿ�����϶�����ǰһ��ʣ�µ�һ����һ����
 * ����10���������ٳ�ʱ����ֻʣ��һ�������ˡ����һ�칲ժ�˶��١�*/
public class MonkeyTest {
	public static void main(String[] args) {
		int sum = 1;
		for(int i = 9;i>=1;i++) {
			sum = (sum+1)*2;
			
		}
		System.out.println(sum);
	}
}
