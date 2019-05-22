package d01_constants;

public class ConstantsDemo {
	//定义类常量	
	public static final double CM_PER_INCH = 2.54;
	
	public static void main(String[] args) {
		//定义方法内常量
		//final double CM_PER_INCH = 2.54;
		double paperWidth = 4;
		double paperLength = 5;
		System.out.println("Paper size in centimeter is :"+
				paperWidth*CM_PER_INCH+" by "+paperLength*CM_PER_INCH);
		
	}
}
