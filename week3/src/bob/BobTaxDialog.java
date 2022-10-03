/**
 * 
 */
package bob;

import javax.swing.JOptionPane;

/**
 * @author grewalkiratveer
 *
 */
public class BobTaxDialog {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//This program will calculate Bob taxes
		
		//Declare values
		String salary ;
		double bobSalary;
		double taxRate = 0.26;
		double taxPercentage = taxRate * 100;
				
		//take the users input as string
		salary = JOptionPane.showInputDialog("Please enter your salary ");
		bobSalary = Double.parseDouble(salary); //Convert string to double
			
		double taxOwned = taxRate * bobSalary;
		double finalSalary = bobSalary - taxOwned;
			
		//used for output
		JOptionPane.showMessageDialog(null, "Your salary in $" +bobSalary+ " at the tax rate of "+taxPercentage
		+"% the final salary is $" +finalSalary);
	}

}
