package d08_02multidimensional_arrays;

/**
 * This program shows how to store tabulardata in 2d arrays.
 * 
 * @author ะกั๎
 * @version V1.0
 */
public class CompoundInterestDemo {
	public static void main(String[] args) {
		final double STARTRATE = 10;
		final int NYEARS = 10;
		final int NRATE = 6;

		// set interestrate from 10%to 15%
		double[] rate = new double[NRATE];
		for (int i = 0; i < rate.length; i++) {
			rate[i] = (STARTRATE + i) / 100.0;
		}

		// set initial balances to 10000
		double[][] balances = new double[NYEARS][NRATE];
		for (int i = 0; i < balances[i].length; i++) {
			balances[0][i] = 10000;
		}

		// compute interest for future years.
		for (int i = 1; i < balances.length; i++) {
			for (int j = 0; j < balances[i].length; j++) {
				// balances = oldBalances + oldBalances*rate
				double oldBalance = balances[i - 1][j];
				double rateBalance = oldBalance * (rate[j]);
				balances[i][j] = oldBalance + rateBalance;
			}
		}
		// print one row of rate.
		for (int j = 0; j < rate.length; j++) {
			System.out.printf("%9.0f%%", 100 * rate[j]);
		}
		System.out.println();
		// print balance table
		for (double[] row : balances) {
			for (double b : row) {
				System.out.printf("%10.2f", b);
				
			}
			System.out.println();
		}

	}
}
