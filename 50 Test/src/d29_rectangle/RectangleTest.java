package d29_rectangle;



/*��һ��3*3����Խ���Ԫ��֮��

�������������˫��forѭ�����������ά���飬�ٽ�a[i][i]�ۼӺ������
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
				System.out.print(arr[i][j]+" ");//��ӡ
				
			}
			System.out.print(" �Խ���Ԫ��Ϊ"+arr[i][i]);
			sum1 +=arr[i][i];
			sum2 += arr[i][arr.length-i-1];
			System.out.println();
		}
		System.out.println(sum1+" "+sum2);
//		System.out.println(Arrays.deepToString(arr));
//		[[5, 4, 9], [7, 8, 4], [7, 2, 3]]

	}
}
