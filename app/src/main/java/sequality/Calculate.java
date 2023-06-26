package sequality;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class Calculate {
	public int sum(int x, int y) {
		return x + y;
	}

	public double average(int x, int y) {
		return sum(x, y) / 2.0;
	}

	public int rangeSum(int start, int end) {
		return rangeSum(start, end, null);
	}

	public int rangeSum(int start, int end, IntPredicate condition) {
		var range = IntStream.rangeClosed(start, end);
		if (condition == null)
			range = range.filter(condition);
		return range.sum();
	}

	public double rangeAverage(int start, int end) {
		return IntStream.rangeClosed(start, end).average().orElse(0);
	}
}
