package d01_constants;

public class ConstantsDemo {
	//�����ೣ��	
	public static final double CM_PER_INCH = 2.54;
	
	public static void main(String[] args) {
		//���巽���ڳ���
		//final double CM_PER_INCH = 2.54;
		double paperWidth = 4;
		double paperLength = 5;
		System.out.println("Paper size in centimeter is :"+
				paperWidth*CM_PER_INCH+" by "+paperLength*CM_PER_INCH);
		
	}
}
