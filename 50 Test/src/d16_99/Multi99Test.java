package d16_99;
//³Ë·¨±í
public class Multi99Test {
	public static void main(String[] args) {
		for(int i = 1;i<=9;i++) {
			for(int j = 1;j<=i;j++) {
				int result = i*j;
				
				System.out.printf("%2d*%1d=%2d",i,j,result);
			}
			System.out.println();
		}
	}
}
