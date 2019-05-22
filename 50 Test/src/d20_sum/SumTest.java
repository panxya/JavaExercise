package d20_sum;

/*有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13...求出这个数列的前20项之和。
程序分析：请抓住分子与分母的变化规律。
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
		System.out.println("前20项的和为"+sum);
	}
}
