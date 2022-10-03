/**
 * 
 */
package assignment5_6;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

/**
 * @author grewalkiratveer
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program jatt = new Program();
		
		DecimalFormat formatnum = new DecimalFormat("$#,##0.00");
		
		int a = 0;
		do {
			a++;
			jatt.user1 = JOptionPane.showInputDialog("Enter your username: ");
			
			jatt.pass1 = JOptionPane.showInputDialog("Enter your password: ");
			
			if (!jatt.isUserPassValid() && a < 3)
			
				JOptionPane.showMessageDialog(null, "Please enter valid username and password.");
			
		} while (a < 3 && !jatt.isUserPassValid() );

		if (jatt.isUserPassValid()) {
			JOptionPane.showMessageDialog(null, "Access granted!!!!!");
			
			Program attitude = new Program();
			attitude.Firstname = JOptionPane.showInputDialog("Enter your first name: ");
			attitude.Lastname = JOptionPane.showInputDialog("Enter your last name: ");
			
			attitude.hoursPackageA = Integer.parseInt(JOptionPane.showInputDialog("How many hours do you want for package A (" + formatnum.format(attitude.pricePackageA) + "):"));
			attitude.hoursPackageB = Integer.parseInt(JOptionPane.showInputDialog("How many hours do you want for package B (" + formatnum.format(attitude.pricePackageB) + "):"));
			
			attitude.daysStorageSmall = Integer.parseInt(JOptionPane.showInputDialog("How many days do you want for a small storage (" + formatnum.format(attitude.priceStorageSmall) + "):"));
			attitude.daysStorageLarge = Integer.parseInt(JOptionPane.showInputDialog("How many hours do you want for a large storage (" + formatnum.format(attitude.priceStorageLarge) + "):"));
			
			attitude.smallBoxesno = Integer.parseInt(JOptionPane.showInputDialog("How many small boxes (" + formatnum.format(attitude.priceSmallBoxes) + ") do you want? :"));
			attitude.LargeBoxesno = Integer.parseInt(JOptionPane.showInputDialog("How many large boxes (" + formatnum.format(attitude.priceLargeBoxes) + ") do you want? :"));
			
			if (attitude.hoursPackageA > 0 && attitude.hoursPackageB > 0)	
				attitude.serviceCost(attitude.hoursPackageA, attitude.hoursPackageB);
			else if (attitude.hoursPackageA > 0)				
				attitude.serviceCost(attitude.hoursPackageA, "A");
			else if (attitude.hoursPackageB > 0)				
				attitude.serviceCost(attitude.hoursPackageB, "B");
			else 	
				attitude.serviceCost();
			
			JOptionPane.showMessageDialog(null, "Service Cost is " + formatnum.format(attitude.serviceCostValue));
			JOptionPane.showMessageDialog(null, "Items Cost is " + formatnum.format(attitude.itemCost()));
			JOptionPane.showMessageDialog(null, "Total Cost is " + formatnum.format(attitude.totalCost()));
		}
		else 
			JOptionPane.showMessageDialog(null, "You have exceeded your try’s, goodbye!!!!!!!!");
	}
}
