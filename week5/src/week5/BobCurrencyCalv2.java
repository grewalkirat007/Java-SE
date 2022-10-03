/**
 * 
 */
package week5;

import javax.swing.JOptionPane;

/**
 * @author grewalkiratveer
 *
 */
public class BobCurrencyCalv2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String USD;
		double dollar;
		USD = JOptionPane.showInputDialog("Enter the amount");
		dollar = Double.parseDouble(USD);
		double CAD = 1.33;
		double value = dollar * CAD;
		
		JOptionPane.showMessageDialog(null, "USD$" +dollar+ "is equal to CAD$" +value);
	}

}
