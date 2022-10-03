/**
 * 
 */
package week13;

import java.util.ArrayList;

/**
 * @author grewalkiratveer
 *
 */
public class Week13ArrayList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> firstList = new ArrayList <String>();
		
		//1. Add five name to the list 5 
			firstList.add("Bob"); 
			firstList.add("Bobby"); 
			firstList.add("Bill"); 
			firstList.add("Billy"); 
			firstList.add("Bans"); 
		
		//2. Get the size of the list 
			//firstlist.size(); 
			System.out.println(firstList.size());
			
		//3. Get the value of the first element
			//firstList.get(0); 
			System.out.println(firstList.get(0)); 
		
		//4. Print the list 
			System.out.println(firstList); 
		
		//5 .Remove 
			firstList.remove(4); 
		
		//6. Replace Billy with your name 
			firstList.set(3, "Bam was removed from here"); 
			
		//7. Print the list again 
			System.out.println(firstList); 
		
		//8. Enhanced for loop 
			for(String names : firstList) 
				{
					System.out.println(names); 
				} 

	}

}
