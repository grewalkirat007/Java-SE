/**
 * 
 */
package exception;

/**
 * @author grewalkiratveer
 *
 */
public class ClassOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try
		{
			
		int[] arrayOne =new int[2];
		arrayOne[0] = 1;
		arrayOne[1] = 2;
		arrayOne[2] = 3;
		throw new ArrayIndexOutOfBoundsException("problems");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("2 is invalid.");
		}
		catch(Exception e)
		{
			System.out.println("Try again.");
		}
		finally 
		{
				System.out.println("always run.");
		}
	}

}
