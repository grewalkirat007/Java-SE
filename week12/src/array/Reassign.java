/**
 * 
 */
package array;

/**
 * @author grewalkiratveer
 *
 */
public class Reassign {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array1 = { 2, 4, 6, 8, 10 };
		int[] array2 = array1;
		
		array2[0] = 10;
		System.out.println(array1[0]);
		System.out.println(array2[0]);
	}

}
