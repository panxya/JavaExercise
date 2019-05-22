package split;
import java.util.Scanner;

public class split {
	



		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			//Çø¼ä
			String aa = "18-22";
			String regex = "-";
			String[] arr = aa.split(regex);
			
			int start = Integer.parseInt(arr[0]);
			int end = Integer.parseInt(arr[1]);
			
			if(a >= start && a <= end) {
				System.out.println("you are my wanted.");
			}else {
				System.out.println("Sorry,we haven't yuan.");
			}
			
			
			
		}
	}


