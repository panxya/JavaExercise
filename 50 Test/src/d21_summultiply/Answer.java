package d21_summultiply;

public class Answer {
	public static void main(String[] args){
		long sum = 0;
		for(int i=0;i<20;i++)
		  sum += factorial(i+1);
		System.out.println(sum);
	}
	//½×³Ë
	private static long factorial(int n){
		int mult = 1;
		for(int j=1;j<n+1;j++)
		  mult *= j;
		return mult;
	}

}
