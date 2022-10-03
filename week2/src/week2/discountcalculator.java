/**
 * 
 */
package week2;

/**
 * @author grewalkiratveer
 *
 */
public class discountcalculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declare values
		double discount = 10;
		double amount = 50;
		double discountAmount = amount * discount / 100;
		double totalAmount = amount - discountAmount;
		System.out.println("The amount after applying "+ discount + "% discount on "+amount+ " is " + totalAmount);
	}

}
