package d28_sort;
/*��10������������

�����������������ѡ�񷨣�
���Ӻ�9���ȽϹ����У�
ѡ��һ����С�����һ��Ԫ�ؽ�����
�´����ƣ����õڶ���Ԫ�����8�����бȽϣ������н�����
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
