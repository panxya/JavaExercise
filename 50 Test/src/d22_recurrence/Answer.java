package d22_recurrence;

public class Answer {
	public static void main(String[] args){
		System.out.println(fact(10));
	}
	//�ݹ���׳�
	private static long fact(int n){
		if(n==1)
		  return 1;
		else
		  return fact(n-1)*n;
	}

}
