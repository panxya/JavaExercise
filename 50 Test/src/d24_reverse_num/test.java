package d24_reverse_num;

//��һ��������5λ����������
//Ҫ��һ�������Ǽ�λ�������������ӡ����λ���֡�
/*while /10 >=0 if <0ͣ��
 * ��ȡ��λ����
 * */
public class test {
	public static void main(String[] args) {
		//�������λ��
		int num =(int) (Math.random()*10000);
		int num1 = num;
		int count = 0;
		System.out.println(num1);
		//��ȡ������֪��������С��1
		while(true) {
			count++;
			if(num1/10<1) {
				break;
			}
			num1/=10;
		}
//		for(int count1 = 0;num/10>1;count1++) {
//			
//			if(num<1) {
//				System.out.println(count1);
//			}
//			num/=10;
//		}���� ��ͻ��
		
		System.out.println(count);
		reverse(num,count);
	}
//ͨ��/10��ȡ����
	private static void reverse(int num, int count) {
		int[] arr = new int[count];
		for(int i = 0;i<arr.length;i++) {
			arr[i]= num%10;
			num/=10;
			System.out.print(arr[i]);
		}
	}
}
