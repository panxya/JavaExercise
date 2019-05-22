package d27_primenum;

public class Answer {
	public static void main(String[] args){
		int n = 100;
		System.out.print(n+"���ڵ�������");
		for(int i=2;i<n+1;i++){
			if(isPrime(i))
			  System.out.print(i+" ");
		}
	}
	//������
	private static boolean isPrime(int n){
		boolean flag = true;
		for(int i=2;i<Math.sqrt(n)+1;i++)
			if(n%i==0){
			  flag = false;
			  break;
			}
		return flag;
	}

}
