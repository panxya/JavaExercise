package d30_insert;

import java.util.Arrays;

/*有一个已经排好序的数组。现输入一个数，要求按原来的规律将它插入数组中。

程序分析：首先判断此数是否大于最后一个数，
然后再考虑插入中间的数的情况，
插入后此元素之后的数，依次后移一个位置。

*/
public class InsertTest {
	public static void main(String[] args) {
		int[] arr = { 11, 23, 34, 44, 56, 67, 71, 89, 90, 91 };
		int a = (int) (Math.random() * 100);
		System.out.println(a);
		insert(arr, a);
		System.out.println(Arrays.toString(arr));
	}

	private static void insert(int[] arr, int a) {
		int[] arr1 = new int[arr.length + 1];

		if(a>=arr[arr.length-1]) {
			for(int i = 0;i<arr.length;i++) {
				arr1[i]=arr[i];
			}
			arr1[arr1.length-1]=a;
		}else {
		for (int i = 0; i <arr.length ; i++) {
			if (arr[i] > a) {
				arr1[i] = a;

				for (int j = 0; j < i; j++) {
					arr1[j] = arr[j];
				}
				for (int k = i + 1; k < arr1.length; k++) {
					arr1[k] = arr[k - 1];
				}

				break;
			}
			
		}
		}
		//下法不妥<1不妥 上法>最后不妥
//		int[] B = new int[A.length+1];
//		for(int i=A.length-1;i>0;i--)
//		  if(a>A[i]){
//		  	B[i+1] = a;
//		    for(int j=0;j<=i;j++)
//		      B[j] = A[j];
//		      for(int k=i+2;k<B.length;k++)
//		        B[k] = A[k-1];

//		  }

		System.out.println(Arrays.toString(arr1));
	}
}
