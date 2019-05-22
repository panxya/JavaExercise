/*
成员对象：ab
成员方法：运算
*/
import java.util.Scanner;
class Calculation {
	public int add(int a,int b) {
		return(a + b);
	}
	
	public int sub(int a,int b) {
		return(a - b);
	}
	
	public int mul(int a,int b) {
		return(a*b);
		
	}

	public int div(int a,int b) {
		return(a/b);
	}
}


class CalculationTest {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("请输入第一个数：");
	int FirstNumber = sc.nextInt();
	System.out.println("请输入第二个数据：");
	int SecondNumber = sc.nextInt();
	
	//创建对象
	Calculation s = new Calculation();
	
	System.out.println("加法和为："+s.add(FirstNumber,SecondNumber));
	System.out.println("减法和为："+s.sub(FirstNumber,SecondNumber));
	System.out.println("乘法和为："+s.mul(FirstNumber,SecondNumber));
	System.out.println("除法和为："+s.div(FirstNumber,SecondNumber));
		

	}
}