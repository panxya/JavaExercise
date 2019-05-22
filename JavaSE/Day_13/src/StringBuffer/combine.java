package StringBuffer;

public class combine {
	public static void main(String[] args) {
		int[] arr = { 11, 12, 33, 45 };
		String ss = combineArr(arr);
		System.out.println(ss);
	}

	public static String combineArr(int[] arr) {
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		for (int x = 0; x < arr.length; x++) {
			if (x == arr.length - 1) {
				sb.append(arr[x]);
			} else {
				sb.append(arr[x]).append(", ");
			}
		}
		sb.append("]");
		return sb.toString();
	}

}
