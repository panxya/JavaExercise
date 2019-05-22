package array03;

public class Find {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,7};
		int a = 1;
		int b =getIndex(arr,a);
		
		System.out.println(b);
	}
	
	
	public static int getIndex(int[] arr,int a) {
		int index = -1;
		for(int x = 0;x<arr.length;x++) {
			if(arr[x]==a) {
//				return x;
				index = x;
				break;
			}
			
		}
		return index;
//		return -1;
		
	}
	
}
