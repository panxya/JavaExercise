package d28_sort;
/*对10个数进行排序

程序分析：可以利用选择法，
即从后9个比较过程中，
选择一个最小的与第一个元素交换，
下次类推，即用第二个元素与后8个进行比较，并进行交换。
*/
public class SortTest {
	public static void main(String[] args) {
		int[] arr = {11,23,12,43,54,74,23,12,34,67} ;
		for(int i = 0;i<arr.length;i++) {
			for(int j = i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		
		}
		for(int j=0;j<arr.length;j++){
			System.out.print(arr[j]+" ");
		}
	}
}
