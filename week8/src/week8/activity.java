/**
 * 
 */
package week8;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * @author grewalkiratveer
 *
 */
public class activity {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String name = "Grewal";
		int a = 3;
		int b = 4;
		first();
		second();
		third(name);
		fourth(a, b);
		int newnme = fiveth(a, b);
		System.out.println("Product of a and b is " + newnme);
		String sixth = enterName();
		enterValue(sixth);
		printValue(sixth);
	}
	public static void first()
	{
		System.out.println("BigBoss");
	}
	public static void second()
	{
		int a1 = 4;
		int b1 = 2;
		int sum = a1 + b1;
		System.out.println("Sum of a and b is "+sum);
	}
	public static void third(String name)
	{
		System.out.println(name);
	}
	public static void fourth(int a, int b)
	{
		int sum = a + b;
		System.out.println("Sum of a and b is "+sum);
	}
	public static int fiveth(int a, int b)
	{
		int product = a * b;
		return product;
	}
	public static String enterName()
	{
		String filename;
		filename = JOptionPane.showInputDialog("Enter the name of the file \n");
		return filename;
	}
	public static void enterValue(String sixth) throws IOException
	{
		PrintWriter myfile = new PrintWriter(sixth);
		myfile.println("Bob");
		myfile.close();
	}
	public static void printValue(String sixth) throws IOException
	{
		File name = new File(sixth);
		Scanner scanfile = new Scanner(name);
		System.out.println(scanfile.nextLine());
		scanfile.close();
	}
}
