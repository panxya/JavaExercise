/*
猜数小游戏
1.创建随机数
2.键盘录入数据
3.随机数与录入对比
    a：大了
	b：小了
	c：中
*/

import java.util.Scanner;
class Game {

	public static void main(String[] args) {
		//创建随机数
		int number = (int)(Math.random()*100)+1;
		//键盘录入
		while(true) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入你猜的1-100中的一个数字");
			int a = sc.nextInt();
			
			if(a>number) {
				System.out.println("你猜的数字"+a+"大了");
			}else if(a<number) {
				System.out.println("你猜的数字"+a+"小了");
			}else{
				System.out.println("真勇士，猜中啦！");
				break;
			}

		}	
	
	}

}