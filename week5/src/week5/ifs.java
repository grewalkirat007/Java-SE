/**
 * 
 */
package week5;

/**
 * @author grewalkiratveer
 *
 */
public class ifs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//if
			int a = 12;
			if(a==12)
			{
				System.out.println("answer is correct");
			}
		//if else
			int b = 10;
			int c = 15;
			if(b>c)
			{
				System.out.println("B is greater than C.");
			}
			else
			{
				System.out.println("C is greater than B.");
			}
				
		//if else if
			int d = 14;
			int e = 18;
			int f = 20;
			if(d>e)
			{
				System.out.println("D is greater than E.");
			}
			else if(d>f)
			{
				System.out.println("D is greater than F.");
			}
			else
			{
				System.out.println("E is greater than F.");
			}
		//nested if else
			int g = 21;
			int h = 23;
			int i = 25;
			int j = 27;
			if(g>h)
			{
				if(h>i)
				{
					System.out.println("H is greater than I.");
				}
				else if(i>j)
				{
					System.out.println("I is greater than J.");
				}
				else
				{
					System.out.println("G is greater than H.");
				}
			}
			else
			{
				System.out.println("H is greater than G.");
			}
				
		//switch
			int k = 19;
	        switch (k) {
	            case 12: System.out.println("k = 12");
	            break;
	            case 13: System.out.println("k = 13");
                break;
	            case 15: System.out.println("k = 15");
                break;
	            case 18: System.out.println("k = 18");
                break;
	            case 19: System.out.println("k = 19");
                break;
	            default: System.out.println("Not in the option");
	            break;
	        }
		
		
	}

}
