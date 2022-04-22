package Default;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

class OperationTest {

	@Test
	void testSum() {
		BigDecimal n1 = new BigDecimal("2");
		BigDecimal n2 = new BigDecimal("2");
		BigDecimal exv = new BigDecimal("4");
		BigDecimal res= Operation.sum(n1, n2);
		assertTrue(exv.compareTo(res) == 0);

	}

	@Test
	void testSub() {
		BigDecimal n1 = new BigDecimal("2");
		BigDecimal n2 = new BigDecimal("2");
		BigDecimal exv = new BigDecimal("0");
		BigDecimal res= Operation.sub(n1, n2);
		assertTrue(exv.compareTo(res) == 0);
	}

	@Test
	void testMul() {
		BigDecimal n1 = new BigDecimal("2");
		BigDecimal n2 = new BigDecimal("2");
		BigDecimal exv = new BigDecimal("4");
		BigDecimal res= Operation.mul(n1, n2);
		assertTrue(exv.compareTo(res) == 0);
	}

	@Test
	void testDiv() {
		BigDecimal n1 = new BigDecimal("2");
		BigDecimal n2 = new BigDecimal("2");
		BigDecimal exv = new BigDecimal("1");
		BigDecimal res= Operation.div(n1, n2);
		assertTrue(exv.compareTo(res) == 0);
	}

	@Test
	void testMod() {
		BigDecimal n1 = new BigDecimal("10");
		BigDecimal n2 = new BigDecimal("3");
		BigDecimal exv = new BigDecimal("1");
		BigDecimal res= Operation.mod(n1, n2);
		assertTrue(exv.compareTo(res) == 0);
	}

}
