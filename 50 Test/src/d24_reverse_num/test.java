package d24_reverse_num;

//给一个不多于5位的正整数，
//要求：一、求它是几位数，二、逆序打印出各位数字。
/*while /10 >=0 if <0停下
 * 获取各位数据
 * */
public class test {
	public static void main(String[] args) {
		//随机的五位数
		int num =(int) (Math.random()*10000);
		int num1 = num;
		int count = 0;
		System.out.println(num1);
		//获取个数，知道被除数小于1
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
//		}不妥 冲突了
		
		System.out.println(count);
		reverse(num,count);
	}
//通过/10获取逆序
	private static void reverse(int num, int count) {
		int[] arr = new int[count];
		for(int i = 0;i<arr.length;i++) {
			arr[i]= num%10;
			num/=10;
			System.out.print(arr[i]);
		}
	}
}
