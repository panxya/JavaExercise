package d22_recurrence;
//5! 递归
public class RecurrenceTest {
	public static void main(String[] args) {
		int a = 5;
		int result= recurrence(a);
		System.out.println(result);
	}

	private static int recurrence(int a) {
		
		int b=1;
		if(a==1) {
			return b;
		}else {
			b=a*recurrence(a-1);
			return b;
		}
	//可以去掉b更加简洁
	}
}
