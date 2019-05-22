package d10_distance;

/*
 * 一球从100米高度自由落下，
 * 每次落地后反跳回原高度的一半；
 * 再落下，求它在 第10次落地时，共经过多少米？
 * h 高度落下 n次反弹后经过举例
 * 第一次落地：100
 * 第二次：100+50*2
 * 第三次：100+50*2+25*2
 * 第四次：100+50*2+25*2+22.5*2
 * 第10次反弹多高？即第十一次的距离*/
public class DistancesTest {
	public static void main(String[] args) {
		int h = 100;
		int n = 10;
		distance(h,n);
	}

	private static void distance(int h, int n) {
		double length = 0;
		
		for(int i = 0;i<n;i++) {
			
			length += h;
			h /= 2.0;
		}
		System.out.println("第"+n+"次距离为："+h+"，共计："+length);
	}
}
