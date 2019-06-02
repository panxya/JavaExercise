package d04_02static_inner_class;

/**
 * this program demonstrates the use of static inner classes
 * 
 * @author ะกั๎
 * @version V1.0
 */
public class StaticInnerClassesTest {
	public static void main(String[] args) {
		double[] d = new double[20];
		for (int i = 0; i < d.length; i++) {
			d[i] = Math.random() * 100;
		}

		ArrayAlg.Pair p = ArrayAlg.minmax(d);
		System.out.println(p.getFirst());
		System.out.println(p.getSecond());
	}
}

class ArrayAlg {
	public static class Pair {
		private double first;
		private double second;

		public Pair(double f, double s) {
			first = f;
			second = s;
		}

		/**
		 * @return the f
		 */
		public double getFirst() {
			return first;
		}

		/**
		 * @return the s
		 */
		public double getSecond() {
			return second;
		}

	}

	public static Pair minmax(double[] d) {
		double min = Double.POSITIVE_INFINITY;
		double max = Double.NEGATIVE_INFINITY;
		for (double v : d) {
			if (min > v)
				min = v;
			if (max < v)
				max = v;
		}

		return new Pair(min,max);
	}

	

}