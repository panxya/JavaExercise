package d25_symmetrical_num;

/*一个5位数，判断它是不是回文数。
 * 即12321是回文数，
 * 个位与万位相同，
 * 十位与千位相同。*/
public class Test {
	public static void main(String[] args) {
		int num = 12321;
		System.out.println(num);
		
		System.out.println(isSymmetrical(num));
		
	}

	private static boolean isSymmetrical(int num) {
		int[] arr= new int[5];
		boolean flag = false;
		//逆序赋值
		for(int i = 0;i<arr.length;i++) {
			arr[i] = num%10;
			num/=10;
		}
		//顺序逆序都获取一次 嵌套for之后对比内外层
		for(int i = 0;i<arr.length;i++) {
			for(int j = arr.length-1;j>=0;j--) {
				if(arr[i]==arr[j]) {
					flag= true;
				}else {
					flag= false;
				}
			}
		}
		return flag;
		
	}
}
