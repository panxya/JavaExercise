package d21_summultiply;

/*题目：求1+2!+3!+...+20!的和
*/
public class Test {
	public static void main(String[] args) {

		long sum = 0;
		for (int i = 0; i < 20; i++) {
			sum += multiple(i + 1);		
		}
		System.out.println(sum);
	}

//单个阶乘值
	private static long multiple(int a) {

		int mul = 1;//此处采用long与int是有区别的
		for (int j = 1; j < a + 1; j++) {
			mul *= j;
		}
		return mul;
	}
}
//public static void main(String[] args){
//	long sum = 0;
//	for(int i=0;i<20;i++)
//	  sum += factorial(i+1);
//	System.out.println(sum);
//}
////阶乘
//private static long factorial(int n){
//	int mult = 1;
//	for(int j=1;j<n+1;j++)
//	  mult *= j;
//	return mult;
//}