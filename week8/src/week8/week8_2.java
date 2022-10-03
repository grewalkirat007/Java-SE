/**
 * 
 */
package week8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author grewalkiratveer
 *
 */
public class week8_2 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//print your name to a file called myname.txt
		PrintWriter file1 = new PrintWriter("myname.txt");
		file1.println("Grewal");
		file1.close();
		
		//print your name to a file called name.txt to your main class folder
		PrintWriter file2 = new PrintWriter("../name.txt");
		file2.println("Grewal");
		file2.close();
		
		//print your name to a file without overwriting the file
		FileWriter file3 =new FileWriter("../name.txt", true);
		PrintWriter file3_1 = new PrintWriter(file3);
		file3_1.println("Kiratveer Grewal");
		file3_1.close();
		
		//create a file that will be over written to your src folder for week8
		FileWriter file4 =new FileWriter("myname.txt", false);
		PrintWriter file4_1 = new PrintWriter(file4);
		file4_1.println("Kiratveer Singh Grewal");
		file4_1.close();
		
		//delete a file
		File file5 = new File("name.txt");
		file5.delete();
		
	}

}
