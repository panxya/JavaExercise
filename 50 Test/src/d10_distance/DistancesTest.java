package d10_distance;

/*
 * һ���100�׸߶��������£�
 * ÿ����غ�����ԭ�߶ȵ�һ�룻
 * �����£������� ��10�����ʱ�������������ף�
 * h �߶����� n�η����󾭹�����
 * ��һ����أ�100
 * �ڶ��Σ�100+50*2
 * �����Σ�100+50*2+25*2
 * ���ĴΣ�100+50*2+25*2+22.5*2
 * ��10�η�����ߣ�����ʮһ�εľ���*/
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
		System.out.println("��"+n+"�ξ���Ϊ��"+h+"�����ƣ�"+length);
	}
}
