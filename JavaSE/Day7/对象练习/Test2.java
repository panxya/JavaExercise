 import java.util.Scanner;
 
 class rectangle {
	private int length;
	private int width;
	
	public rectangle(){}
	
//set即可
	public void setLength(int length) {
		this.length = length;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	//周长
	public int perimeter() {
		return ((length+width)*2);
	}
	//面积
	public int area() {
		return (length*width);
	}	
	
	
}


class Test2 {
	public static void main(String[] args) {
	//创建键盘录入对象
	Scanner sc = new Scanner(System.in);
	
	System.out.println("请输入长：");
	int length = sc.nextInt();
	System.out.println("请输入宽");
	int width = sc.nextInt();
	//创建对象
	
	rectangle rec = new rectangle();
	rec.setLength(length);
	rec.setWidth(width);
	System.out.println("周长是："+rec.perimeter());
	System.out.println("面积是："+rec.area());
	
	
	}

}
	