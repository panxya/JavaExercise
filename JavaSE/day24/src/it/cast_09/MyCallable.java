package it.cast_09;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {
	private int num;

	public MyCallable(int num) {
		this.num = num;
	}

	@Override
	public Integer call() throws Exception {
		int sum = 0;
		for (int x = 0; x <= num; x++) {
			sum += x;
		}

		return sum;
	}

}
