package d29_rectangle;



/*求一个3*3矩阵对角线元素之和

程序分析：利用双重for循环控制输入二维数组，再将a[i][i]累加后输出。
*/
public class RectangleTest {

	public static void main(String[] args) {
		int[][] arr = new int[3][3];
		print(arr);
		
	}

	private static void print(int[][] arr) {
		
		int sum1 = 0;
		int sum2 = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (int) (Math.random()* 10) ;
				System.out.print(arr[i][j]+" ");//打印
				
			}
			System.out.print(" 对角线元素为"+arr[i][i]);
			sum1 +=arr[i][i];
			sum2 += arr[i][arr.length-i-1];
			System.out.println();
		}
		System.out.println(sum1+" "+sum2);
//		System.out.println(Arrays.deepToString(arr));
//		[[5, 4, 9], [7, 8, 4], [7, 2, 3]]

	}
}
