/**
 * 
 */
package week12;

/**
 * @author grewalkiratveer
 *
 */
public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassOne obj1 = new ClassOne();
		
		System.out.println(obj1.name);
		
		obj1.name = "Bob";
		System.out.println(obj1.name);
		obj1.methodOne();
	}

}
