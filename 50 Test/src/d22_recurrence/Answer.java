package d22_recurrence;

public class Answer {
	public static void main(String[] args){
		System.out.println(fact(10));
	}
	//µÝ¹éÇó½×³Ë
	private static long fact(int n){
		if(n==1)
		  return 1;
		else
		  return fact(n-1)*n;
	}

}
