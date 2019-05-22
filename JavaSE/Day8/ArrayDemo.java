class ArrayDemo {
	public static void main(String[] args) {
		int[] arr = {11,12,13,55,66,87};
		
		ArrayTool.ArrayPrint(arr);
		
		int max = ArrayTool.getMax(arr);
		System.out.println("max="+max);
		
		ArrayTool.getIndec(arr,13);
		
	
	}



}