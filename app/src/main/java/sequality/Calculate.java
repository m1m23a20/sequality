package sequality;

import java.util.stream.IntStream;

public class Calculate {
	public int sum(int x, int y) {
		return x + y;
	}

	public double average(int x, int y) {
		return sum(x, y) / 2;
	}

	public int rangeSum(int start, int end) {
		return IntStream.rangeClosed(start, end).sum();
	}

	public double rangeAverage(int start, int end) {
		return IntStream.rangeClosed(start, end).average().orElse(0);
	}
}
