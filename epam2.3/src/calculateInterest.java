
/**
 * This class calculates simple and compound interests.
 * @author ashish
 *
 */

public class calculateInterest {

	/**
	 * calculates simple interest 
	 * @param principle
	 * @param rate
	 * @param time
	 */
	
	public static double simpleInterest(double principle,double rate,int time) {
		
		return (principle*rate*time)/100;
		
	}
	
	/**
	 * calculates compound interest
	 * @param principle
	 * @param rate
	 * @param time
	 */
	
	public static double compoundInterest(double principle,double rate,int time) {
		
		return (principle*(Math.pow(1+(rate/100), time)))-principle;
		
	}
	
}
