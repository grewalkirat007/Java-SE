/**
 * 
 */
package week5;

import javax.swing.JOptionPane;

/**
 * @author grewalkiratveer
 *
 */
public class BobCurrencyCalv3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean access = true;
		String username;
		username = JOptionPane.showInputDialog("Please enter the username");
		
		
		if (username.equalsIgnoreCase("Grewal"))
		{
			String pass;
			pass = JOptionPane.showInputDialog("please enter your password");
			
			if(pass.equals("Ki7@Att07"))
			{
				System.out.println("access granted pass");
				access = true;
				
				
			}
			else
			{
				System.out.println("Incorrect password");
				access = false;
			}
			String choose;
			if (access)
			{
		choose = JOptionPane.showInputDialog("Please enter currency type you want to convert. e.g. \"USD\" or \"CAD\" ");
		   String choose1 = choose.toUpperCase();

			   
			   
			   
	   switch (choose1)
			   {
			case "USD":
			    String currency;
			   double currency1;
			   currency = JOptionPane.showInputDialog("enter amount you want to convert");
			   currency1 = Double.parseDouble(currency);
			double CAD = 1.33 ;
			double value = currency1 * CAD;
			JOptionPane.showMessageDialog(null,"USD $" + currency1 + " is equal to CAD $" + value);
			break;


			case "CAD":
			    currency = JOptionPane.showInputDialog("enter amount you want to convert");
			    currency1 = Double.parseDouble(currency);
			   double USD = .75 ;
			double value1 = USD * currency1;
			JOptionPane.showMessageDialog(null,"CAD $" + currency1 + " is equal to USD $" + value1);
			break;

			default:JOptionPane.showMessageDialog(null,"Write valid currency");
			
			
			   
			   }
			}

		}
	}
}
