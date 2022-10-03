/**
 * 
 */
package methods;

/**
 * @author grewalkiratveer
 *
 */
public class MethodOverloading {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*Method Overloading.*/
		
		int a = 50;
		double b = 50.50;
		String c = "Bob";
		float d = 100.5f;
		long e = 124356576;
		short f = 123;
		method(a);
		method(b);
		method(c);
		method(d);
		method(c, a);
		method(e);
		method(f);
	}
	public static void method(int first)
	{
		System.out.println(first);
	}
	public static void method(double second)
	{
		System.out.println(second);
	}
	public static void method(String third)
	{
		System.out.println(third);
	}
	public static void method(float fourth)
	{
		System.out.println(fourth);
	}
	public static void method(String first, int first1)
	{
		System.out.println(first + " " + first1);
	}
	public static void method(long fiveth)
	{
		System.out.println(fiveth);
	}
	public static void method(short sixth)
	{
		System.out.println(sixth);
	}
	

}
