/**
 * 
 */
package assignment5_6;

/**
 * @author grewalkiratveer
 *
 */
public class Program {

	/**
	 * @param args
	 */
	
		// TODO Auto-generated method stub
		public String Firstname;
		public String Lastname;
		public double pricePackageA = 100.00;
		public int hoursPackageA;
		public double pricePackageB = 150.00;
		public int hoursPackageB;
		public double priceStorageSmall = 8.00;
		public int daysStorageSmall;
		public double priceStorageLarge = 20.11;
		public int daysStorageLarge;
		public double priceSmallBoxes;
		public int smallBoxesno;
		public double priceLargeBoxes;
		public int LargeBoxesno;
		public double val = 0;
		public String user1;
		public String pass1;
		private final String userid = "GReWAlkirAT";
		private final String passid = "G#J0NE3";
		double serviceCostValue;
		
		public Program() {
			priceSmallBoxes = 2.50;
			priceLargeBoxes = 4.50;
		}
		
		public Program(double boxSmll, double boxLrge) {
			priceSmallBoxes = boxSmll;
			priceLargeBoxes = boxLrge;
		}
		
		public void serviceCost() {
			serviceCostValue = 0;
		}
		
		public void serviceCost(int hoursPackageA, int hoursPackageB) {
			serviceCostValue = 0;
			serviceCostValue += pricePackageA * hoursPackageA;
			serviceCostValue += pricePackageB * hoursPackageB;
		}
		
		public void serviceCost(int hrsPackage, String packageType) {
			serviceCostValue = 0;
			if (packageType.equalsIgnoreCase("A"))
				serviceCostValue += pricePackageA * hrsPackage;
			else if (packageType.equalsIgnoreCase("B"))
				serviceCostValue += pricePackageB * hrsPackage;
		}
		
		
		public double itemCost() {
			val += priceSmallBoxes * smallBoxesno;
			val += priceLargeBoxes * LargeBoxesno;
			return val;
		}
		
		public double totalCost() {
			val = 0;
			val +=  serviceCostValue;
			val +=  itemCost ();
			return val;
		}
		
		
		
		public Program(String urname, String psword) {
			user1 = urname;
			pass1 = psword;
		}
		
		public boolean isUserPassValid() {
			if (user1.equals(userid) && pass1.equals(passid))
				return true;
			else
				return false;
		}
	}


