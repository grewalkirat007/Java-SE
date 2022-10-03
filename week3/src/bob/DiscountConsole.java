/**
 * 
 */
package bob;

import java.util.Scanner;

/**
 * @author grewalkiratveer
 *
 */
public class DiscountConsole {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//discount console
		double discountPercent = 0.15;
		double Discount;
		double discountPrice;
		double price;
				
		//input
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the price? ");
		price = keyboard.nextInt();//read the input as a int
				
		//calculation
		Discount = price * discountPercent;
		discountPrice = price - Discount;
				
		//output
		System.out.println("The price is $" +price+" you will receive a discount of $"+Discount
				+" and the total amount after discount is $"
				+ discountPrice);
	}

}
