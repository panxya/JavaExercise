package d20_sum;

/*��һ�������У�2/1��3/2��5/3��8/5��13/8��21/13...���������е�ǰ20��֮�͡�
�����������ץס�������ĸ�ı仯���ɡ�
3=1+2
5=2+3
8=3+5
13=5+8
21=8+13
*/
public class SumTest {
	public static void main(String[] args) {
		double child =1;
		double father = 1;
		double sum = 0;
		
		
		for(int i = 0;i<20;i++) {
			double ctemp = child;
			double ftemp = father;
			
			child = ctemp+ftemp;
			father = ctemp;
			sum += child/father;
		}
		System.out.println("ǰ20��ĺ�Ϊ"+sum);
	}
}
