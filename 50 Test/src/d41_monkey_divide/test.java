package d41_monkey_divide;
/*��̲����һ�����ӣ���ֻ�������֡�
 * ��һֻ���Ӱ��������ƾ�ݷ�Ϊ��ݣ�����һ������ֻ���ӰѶ��һ�����뺣�У�
 * ������һ�ݡ�
 * �ڶ�ֻ���Ӱ�ʣ�µ�������ƽ���ֳ���ݣ��ֶ���һ������ͬ���Ѷ��һ�����뺣�У�
 * ������һ�ݣ�
 * ���������ġ�����ֻ���Ӷ����������ģ�
 * �ʺ�̲��ԭ�������ж��ٸ����ӣ�*/
public class test {
	public static void main(String[] args) {
		int n ;
		n = fun(1);
		System.out.println(n);
	}

	private static int fun(int i) {
		
		if(i==5) {
			return 6;
		}else {
			return fun(i+1)*5+1;
		}
		
	}
	
}
