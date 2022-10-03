/**
 * 
 */
package week8;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author grewalkiratveer
 *
 */
public class Week8Files {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		PrintWriter firstfile = new PrintWriter("myname.txt");
		firstfile.println("Bob ");
		firstfile.println("Bobby");
		firstfile.close();
	}

}
