package sort;

public class select {

	public static void main(String[] args) {
		int[] arr = { 11, 12, 45, 35, 67, 23, 41, 11 ,1};
		SelectSort(arr);
		
	}

	public static void SelectSort(int[] arr) {

		for (int x = 0; x < arr.length-1; x++) {
			for (int y = x + 1; y < arr.length; y++) {
				if (arr[x] > arr[y]) {
					int temp = arr[x];
					arr[x] = arr[y];
					arr[y] = temp;
				}
			}

		}
		// ±éÀú
		System.out.print("[");
		for (int z = 0; z < arr.length; z++) {
			if (z == arr.length-1) {
				System.out.print(arr[z] );
			} else {
				System.out.print(arr[z]+ ", ");
			}

		}
		System.out.println("]");

	}

}
