//��������ֵ ���� ����

public class ArrayTool {
	//����˽��
	private ArrayTool(){}  
	
	//����ArrrayTool
	public static void ArrayPrint(int[] arr) {   //����һ������
		for(int x=0;x<arr.length;x++) {
			if(x == arr.length-1) {
				System.out.println(arr[x]);
			}else {
				System.out.print(arr[x]+",");
			}
		}
	}
	
	//��ֵ
	public static int getMax(int[] arr) {
		int max = arr[0];
		for(int x=0;x<arr.length;x++) {
			if(arr[x]>max) {
				max = arr[x];
			}
		}
		return max;
	}

	//����
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