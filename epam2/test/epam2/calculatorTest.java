package epam2;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

/**
 * The class calculatorTest has 3 methods testSum, testProduct, testDivison which perform testing operation of calculator
 * @author ashish
 *
 */

public class calculatorTest {

	/**
	 * testSum() perform testing of sum operation
	 *
	 */
	
	@Test
	public void testSum() {
		assertEquals(15, calculator.sum(10, 5));
		assertEquals(50, calculator.sum(30, 20));
	}

	/**
	 * testProduct() perform testing of product operation
	 *
	 */
	
	@Test
	public void testProduct() {
		assertEquals(15, calculator.product(3, 5));
		assertEquals(45, calculator.product(3, 15));
	}

	/**
	 * testDivison() perform testing of divison operation
	 *
	 */
	
	@Test
	public void testDivison() {
		assertEquals(15, calculator.divison(45, 3));
		assertEquals(9, calculator.divison(45, 5));
	}

}
