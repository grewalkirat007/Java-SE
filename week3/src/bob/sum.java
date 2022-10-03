/**
 * 
 */
package bob;

import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * @author grewalkiratveer
 *
 */
public class sum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String payratee;
		String hourss;
		double payrte;
		double hourrs;
		payratee = JOptionPane.showInputDialog("Enter your payrate:");
		payrte = Double.parseDouble(payratee);
		hourss = JOptionPane.showInputDialog("How many hours you worked: ");
		hourrs = Double.parseDouble(hourss);
		double resultt = payrte* hourrs;
		JOptionPane.showMessageDialog(null,"Your total pay is: "+resultt);



		Scanner value = new Scanner(System.in);
		System.out.println("Enter your payrate: ");
		double payrate = value.nextDouble();
		System.out.println("How many hours you worked: ");
		double hours = value.nextDouble();

		double result = payrate*hours;
		System.out.println("Your total pay is: "+result);

	}

}
