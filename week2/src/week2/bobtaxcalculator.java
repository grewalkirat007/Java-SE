/**
 * 
 */
package week2;

/**
 * @author grewalkiratveer
 *
 */
public class bobtaxcalculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//this program will calculate Bob Taxes
		//Declare values
		double taxRate = 0.26;
		double bobSalary = 120000;
		double taxOwed = taxRate * bobSalary;
		double finalSalary = bobSalary - taxOwed;
		//output
		System.out.println("Bob owes $ "+taxOwed+" in taxes and "+"Bob's take home pay is "+ finalSalary);
	}

}
