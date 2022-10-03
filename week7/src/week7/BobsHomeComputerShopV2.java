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
public class BobsHomeComputerShopV2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String salary1;
		double salary;
		salary1 = JOptionPane.showInputDialog("Enter the salary");
		salary = Double.parseDouble(salary1); 
		String advancepay1;
		double advancepay;
		advancepay1 = JOptionPane.showInputDialog("Enter the advance");
		advancepay = Double.parseDouble(advancepay1); 
		DecimalFormat formatter = new DecimalFormat("$#00.00");
		DecimalFormat formatter1 = new DecimalFormat("#0%");
		double commission;
		double Totalvalue;
		double percent;
	
		if(salary <= 10000)
		{
			commission = salary * 0.05;
			Totalvalue = commission - advancepay;
			percent = 0.05;
			JOptionPane.showMessageDialog(null, "Your comission is "+ formatter1.format(percent) +" and the commisson is "+ formatter.format(Totalvalue) );
		}
		else if(salary > 10000 && salary < 14999)
		{
			commission = salary * 0.10;
			Totalvalue = commission - advancepay;
			percent = 0.10;
			JOptionPane.showMessageDialog(null, "Your comission is "+ formatter1.format(percent) +" and the commisson is "+ formatter.format(Totalvalue) );
		}
		else if(salary > 15000 && salary < 17999)
		{
			commission = salary * 0.12;
			Totalvalue = commission - advancepay;
			percent = 0.12;
			JOptionPane.showMessageDialog(null, "Your comission is "+ formatter1.format(percent) +" and the commisson is "+ formatter.format(Totalvalue) );
		}
		else if(salary > 18000 && salary < 21999)
		{
			commission = salary * 0.15;
			Totalvalue = commission - advancepay;
			percent = 0.15;
			JOptionPane.showMessageDialog(null, "Your comission is "+ formatter1.format(percent) +" and the commisson is "+ formatter.format(Totalvalue) );
		}
		else  // (salary > 22000)
		{
			commission = salary * 0.16;
			Totalvalue = commission - advancepay;
			percent = 0.16;
			JOptionPane.showMessageDialog(null, "Your comission is "+ formatter1.format(percent) +" and the commisson is "+ formatter.format(Totalvalue) );
		}
	}
}
