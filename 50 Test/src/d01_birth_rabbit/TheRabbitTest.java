package d01_birth_rabbit;
/*
 * 古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，
 * 小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，
 * 问每个月的兔子对数为多少？ 
 * 1,1,2,3,5,8,13,21....  
 * 
 * */
public class TheRabbitTest {
	public static void main(String[] args) {
		//输出30个月的值
		 for(int x = 1;x<30;x++) {
			 System.out.println("第"+x+"个月有"+getCount(x)+"对");
		 }
	}
	
		private static int getCount(int month) {
		if(month == 1||month== 2) {
			return 1;
		}else {
			return getCount(month-1)+getCount(month-2);
		}
	}
}