package sequality;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculateTest {
	@Test
	public void testSum() {
		Calculate calculate = new Calculate();
		int expected = 5;
		assertEquals(expected, calculate.sum(2, 3));
	}

	@Test
	public void testAverage() {
		Calculate calculate = new Calculate();
		assertEquals("2.5", String.format("%.1f", calculate.average(2, 3)));
	}

	@Test
	public void testRangeSum() {
		Calculate calculate = new Calculate();
		assertEquals(5050, calculate.rangeSum(1, 100));
	}

	@Test
	public void testRangeAverage() {
		Calculate calculate = new Calculate();
		assertEquals("50.5", String.format("%.1f", calculate.rangeAverage(1, 100)));
	}

	@Test
	public void testRangeSumWithCondition() {
		Calculate calculate = new Calculate();
		assertEquals(25, calculate.rangeSum(1, 10, num -> num % 2 == 1));
	}
}
