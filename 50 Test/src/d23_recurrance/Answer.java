package d23_recurrance;

public class Answer {
	public static void main(String[] args){
		System.out.println(getAge(5,2));
	}
	//���mλͬ־������
	private static int getAge(int m,int n){
		if(m==1)
		  return 10;
		else
		  return getAge(m-1,n)+n;		
	}

}
