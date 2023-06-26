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
}
