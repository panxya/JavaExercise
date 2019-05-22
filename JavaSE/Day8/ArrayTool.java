//需求：求最值 遍历 索引

public class ArrayTool {
	//构造私有
	private ArrayTool(){}  
	
	//遍历ArrrayTool
	public static void ArrayPrint(int[] arr) {   //定义一个数组
		for(int x=0;x<arr.length;x++) {
			if(x == arr.length-1) {
				System.out.println(arr[x]);
			}else {
				System.out.print(arr[x]+",");
			}
		}
	}
	
	//最值
	public static int getMax(int[] arr) {
		int max = arr[0];
		for(int x=0;x<arr.length;x++) {
			if(arr[x]>max) {
				max = arr[x];
			}
		}
		return max;
	}

	//索引
	public static void getIndec(int[] arr,int value) {
		int index = -1;
		for(int x=0; x<arr.length;x++) {
			if(arr[x] == value) {
				index = x;
				System.out.println("index="+x);
				break;
			}
		}
		
	}	

}