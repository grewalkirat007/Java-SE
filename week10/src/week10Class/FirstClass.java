/**
 * 
 */
package week10Class;

/**
 * @author grewalkiratveer
 *
 */
public class FirstClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SecondClass one = new SecondClass();
		one.firstMethod();
		int total = one.SecondMethod(6, 7);
		System.out.println(total);
		
		//Assign values
		one.name = "Bob";
		one.age = 100;
		one.money = 50.50;
		one.grade = 'A';
		
		
		//declare new variables
		//String 
		
		//print
		System.out.println(one.name);
		System.out.println(one.age);
		System.out.println(one.money);
		System.out.println(one.grade);
		
		
		
		//call method
		one.firstMethod();
		int number = one.SecondMethod(100, 100);
		System.out.println(number);
	}

}
