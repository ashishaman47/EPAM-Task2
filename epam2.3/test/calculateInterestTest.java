import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * The class constructionTest perform testing of interest calculation
 * @author ashish
 */

class calculateInterestTest {

	/**
	 * The class constructionTest perform testing of simple interest calculation
	 * @author ashish
	 */
	
	@Test
	void testSimpleInterest() {
		assertEquals(400, calculateInterest.simpleInterest(500.0,8.0,10));
		assertEquals(480, calculateInterest.simpleInterest(600.0,8.0,10));
	}
	
	/**
	 * The class constructionTest perform testing of simple interest calculation
	 * @author ashish
	 */

	@Test
	void testCompoundInterest() {
		assertEquals(579.462498636394, calculateInterest.compoundInterest(500.0,8.0,10));
		assertEquals(695.3549983636728, calculateInterest.compoundInterest(600.0,8.0,10));
	}

}
