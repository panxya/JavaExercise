package sort;

public class two {
	public static void main(String[] args) {
		int[] arr= {12,13,14,16,77,89,100,101};
		int index = devide(arr,14);
		System.out.println(index);
	}

	public static int devide(int[] arr, int value) {
		int max = arr.length - 1;
		int min = 0;
		int mid = (max + min) / 2;
		while (value != arr[mid]) {
			if (value > arr[mid]) {
				min = mid + 1;
			} else {
				max = mid - 1;
			}

			if (min > max) {
				return -1;
			}
			mid = (max + min) / 2;
		}
		return mid;
	}
}
