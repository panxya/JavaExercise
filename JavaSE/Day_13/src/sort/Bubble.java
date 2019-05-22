package sort;

public class Bubble {
	public static void main(String[] args) {

		int[] arr = { 11, 12, 56, 12, 81, 14, 56, 1 };
		BubbleSort(arr);
	}

	public static void BubbleSort(int[] arr) {
		System.out.print("[");
		// x为比较的次数，y为每次比较转变次数
		for (int x = 0; x < arr.length - 1; x++) {
			for (int y = 0; y < arr.length - 1 - x; y++) {
				if (arr[y] < arr[y + 1]) {
					int temp = arr[y];
					arr[y] = arr[y + 1];
					arr[y + 1] = temp;
				}

			}

		}
		// 遍历功能
		for (int z = 0; z < arr.length; z++) {
			if (z == arr.length - 1) {
				System.out.print(arr[z]);
			} else {
				System.out.print(arr[z] + ", ");
			}	
		}
		System.out.println("]");
	}

}
