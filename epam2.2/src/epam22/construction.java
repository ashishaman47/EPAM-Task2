package epam22;

public class construction {
	
	/**
	 * HouseConstructionCost method is to calculate the the cost of house construction based on various materials
	 * @param materialQuality , gives quality of material used i.e (standard, above standard, high standard)
	 * @param area, gives us area of the house
	 * @param fullyAutomated , gives weather house to be constructrd is fully automated or not
	 * @author ashish
	 */

	public static double HouseConstructionCost(int materialQuality, double area, boolean fullyAutomated) {
			
			/**
			 * material quality is Standard
			 */
		
			if(materialQuality == 1) {
				
				return (1200*area);
				
			}
			
			/**
			 * material quality is above standard 
			 */
			
			else if( materialQuality == 2) {

				return (1500*area);
				
			}
			
			/**
			 * fully automated home with high standard material   
			 */
			
			else if(fullyAutomated){
				
				return (2500*area);
				
			}
			
			/**
			 * high standard material with not fully automation
			 */
			else {
				
				return (1800*area);
			}
		}
}
