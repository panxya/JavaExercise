package d36_remove;

import java.util.Arrays;

/*��n��������
 * ʹ��ǰ�����˳�������m��λ�ã����m���������ǰ���m����*/
public class RemoveTest {
	public static void main(String[] args) {
		int[] A = {1,2,1,2,12,12,12,3,4,5,5};
		int m = 2;
		int[] B = new int[A.length+m];
		for(int i = m;i<B.length ;i++) {
			B[i]=A[i-m];
		}
		
		for(int i = 0;i<m ;i++) {
			B[i]=A[A.length-m+i];
		}
		System.out.println(Arrays.toString(A));
		System.out.println(Arrays.toString(B));
	}
}
