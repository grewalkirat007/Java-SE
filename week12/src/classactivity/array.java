/**
 * 
 */
package classactivity;


import java.util.Scanner;
import java.util.Arrays;

/**
 * @author grewalkiratveer
 *
 */
public class array {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Add five numbers to a fixed-length array of 5, through a user's input.
		Scanner bob = new Scanner(System.in);
		final int size = 5;
		int[] num = new int[size];
		
		System.out.println("Enter five numbers.");
		
		for (int a = 0; a < size; a++)
		{
			System.out.print("Number " + (a + 1) + ": ");
			num[a] = bob.nextInt();
		}
		
		//Compare two arrays, any two of your choice.
		int[] a1 = { 2, 4, 6, 8 };
		int[] a2 = a1;
		
		if (Arrays.equals(a1, a2))
			System.out.println("Arrays are the same.");
		else
		   System.out.println("Arrays are not the same.");
		
		//Copy one array to another array.
		int[] arr1 = { 2, 3, 4, 5 };
		int[] arr = new int[4];
		
		for (int i = 0; i < arr1.length; i++)
		  arr[i] = arr1[i];
		
		System.out.println("The arrays has been duplicated!!!!");
		
		for (int j = 0; j < arr1.length; j++)
			System.out.println(arr1[j] + " = " + arr[j]);
		
		//Print the last two elements of the array in Q#1 by using a method
		for (int i = 3; i < size; i++)
		{
			System.out.println("number in position " + ( i + 1 ) + " is ");
			namee(num[i]);
		}
		
	}
	public static void namee(int num)
	{
		System.out.println(num);
	}
}
