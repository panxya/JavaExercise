package d25_symmetrical_num;

/*һ��5λ�����ж����ǲ��ǻ�������
 * ��12321�ǻ�������
 * ��λ����λ��ͬ��
 * ʮλ��ǧλ��ͬ��*/
public class Test {
	public static void main(String[] args) {
		int num = 12321;
		System.out.println(num);
		
		System.out.println(isSymmetrical(num));
		
	}

	private static boolean isSymmetrical(int num) {
		int[] arr= new int[5];
		boolean flag = false;
		//����ֵ
		for(int i = 0;i<arr.length;i++) {
			arr[i] = num%10;
			num/=10;
		}
		//˳�����򶼻�ȡһ�� Ƕ��for֮��Ա������
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
