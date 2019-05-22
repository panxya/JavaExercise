//数组的遍历

class Array {
	public static void main (String[] agrs) {
	int[] arr = {1,34,36,25,77,33};
	int x;
		for(x=1;x<arr.length;x++) {
			if(x == arr.length-1) {
				System.out.println(arr[x]);
			}else { 
				System.out.print(arr[x]+",");
			}		
	
		}
	
	}

}