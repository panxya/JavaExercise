/*
��Ա����ab
��Ա����������
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
	System.out.println("�������һ������");
	int FirstNumber = sc.nextInt();
	System.out.println("������ڶ������ݣ�");
	int SecondNumber = sc.nextInt();
	
	//��������
	Calculation s = new Calculation();
	
	System.out.println("�ӷ���Ϊ��"+s.add(FirstNumber,SecondNumber));
	System.out.println("������Ϊ��"+s.sub(FirstNumber,SecondNumber));
	System.out.println("�˷���Ϊ��"+s.mul(FirstNumber,SecondNumber));
	System.out.println("������Ϊ��"+s.div(FirstNumber,SecondNumber));
		

	}
}