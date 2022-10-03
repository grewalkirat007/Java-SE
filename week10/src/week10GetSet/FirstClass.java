/**
 * 
 */
package week10GetSet;

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
		
		SecondClass Obj1 = new SecondClass();
		
		//
		Obj1.setName("Bob");
		System.out.println(Obj1.getName());
	
		Obj1.setAge(100);
		System.out.println(Obj1.getAge());
		
		Obj1.setMoney(100.10);
		System.out.println(Obj1.getMoney());
		
		Obj1.setGrade('A');
		System.out.println(Obj1.getGrade());
		
		
		
	}

}
