package d34_sort;
//����3����a,b,c������С˳�������
public class SortTest {
	public static void main(String[] args) {
	int a = 9910;
	int b = 1;
	int c = 9;
		if (a > b) {
			int temp = a;
			a = b;
			b = temp;
		}
		
		if(a>c) {
			int temp = a;
			a=c;
			c=temp;
		}
		
		if(b>c) {
			int temp = c;
			c=b;
			b=temp;
		}
	System.out.println(a+" "+b+" "+c+" ");
	}
	
}
