/*
math包用于执行基本数学运算的方法

没有静态

返回带正号的 double 值，该值大于等于 0.0 且小于 1.0。返回值是一个伪随机选择的数，在该范围内（近似）均匀分布。 
*/

class MathMemo {
	public static void main(String[] args) {
		double d = Math.random();
		System.out.println(d);
		//0-100的
		for(int x = 0;x<100;x++) {
			int n = (int)(Math.random()*100)+1;
			System.out.println(n);
		}
	}
}
