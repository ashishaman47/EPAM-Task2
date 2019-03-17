package epam22;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class constructionTest {
	
	/**
	 * The class constructionTest perform testing of HouseConstructionCost
	 * @author ashish
	 */

	@Test
	public void testHouseConstructionCost() {
		
		assertEquals(540600.0, construction.HouseConstructionCost(1, 450.5, false));
		assertEquals(1251250.0, construction.HouseConstructionCost(3, 500.50, true));
	}

}
