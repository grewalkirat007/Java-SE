/**
 * 
 */
package week5;

import javax.swing.JOptionPane;

/**
 * @author grewalkiratveer
 *
 */
public class password {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			String pass;
			pass = JOptionPane.showInputDialog("please enter your password");
			
			if(pass.equals("Grewal@0987654321"))
			{
				System.out.println("access granted");
			}
			else
			{
				System.out.println("access denied");
			}
		
				

}
}
