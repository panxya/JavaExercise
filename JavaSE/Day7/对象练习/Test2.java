 import java.util.Scanner;
 
 class rectangle {
	private int length;
	private int width;
	
	public rectangle(){}
	
//set����
	public void setLength(int length) {
		this.length = length;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	//�ܳ�
	public int perimeter() {
		return ((length+width)*2);
	}
	//���
	public int area() {
		return (length*width);
	}	
	
	
}


class Test2 {
	public static void main(String[] args) {
	//��������¼�����
	Scanner sc = new Scanner(System.in);
	
	System.out.println("�����볤��");
	int length = sc.nextInt();
	System.out.println("�������");
	int width = sc.nextInt();
	//��������
	
	rectangle rec = new rectangle();
	rec.setLength(length);
	rec.setWidth(width);
	System.out.println("�ܳ��ǣ�"+rec.perimeter());
	System.out.println("����ǣ�"+rec.area());
	
	
	}

}
	