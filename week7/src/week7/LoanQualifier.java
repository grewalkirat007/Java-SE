/**
 * 
 */
package week7;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

/**
 * @author grewalkiratveer
 *
 */
public class LoanQualifier {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Take salary as input /
		String salary1;
		double salary;
		salary1 = JOptionPane.showInputDialog("Enter your salary");
		salary = Double.parseDouble(salary1);
		
		//Take years worked as input /
		String years1;
		double years;
		years1 = JOptionPane.showInputDialog("Enter your number of years worked");
		years = Double.parseDouble(years1);
		
		//Take credit score as a input / 800=2.5%, 500 = 3.5%, 400 = Credit score is low.
		String credit1;
		double credit;
		credit1 = JOptionPane.showInputDialog("Enter your credit score");
		credit = Double.parseDouble(credit1);
		
		DecimalFormat abc = new DecimalFormat("#0.0%");
	if(salary >= 80000)
	{	
		if(years >= 5)
		{
			if(credit <= 400)
			{
				JOptionPane.showMessageDialog(null, "Credit score is low");
			}
			else if (credit <= 500 && credit >= 401)
			{
				double score = 0.035;
				JOptionPane.showMessageDialog(null, "Credit score is " + abc.format(score));
			}
			else if (credit <= 800)
			{
				double score = 0.025;
				JOptionPane.showMessageDialog(null, "Credit score is " + abc.format(score));
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Invalid credit score");
			}
		}
		else
		{
			JOptionPane.showMessageDialog(null, "You worked less than 5 years");
		}
	}
	else {
		JOptionPane.showMessageDialog(null, "salary low");
	}
		//The user will see a message if they are qualified and at what percentage rate.
		//if the user is not qualified they will see salary must be above 80,000 or years worked must be over 5 years or Credit score is low.
		//Use decimal format for the number output.
	}

}
