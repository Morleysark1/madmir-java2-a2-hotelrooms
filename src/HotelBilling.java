import javax.swing.JOptionPane;
	public class HotelBilling {

	private static final double SALES_TAX = 0;
		private Object totalBill;

		public static void main(String[] args) {
		/*
		 * In the main method, declare and initialize variables
		 * for room price, number of rooms booked, and coupon rate.
		 * 
		 * Then call each case of the overloaded method 
		 * calculateBill() to demonstrate the use of overloaded 
		 * methods
		 */
		//these are the declare field
			double roomRate = Double.parseDouble(JOptionPane.showInputDialog("enter the room rate"));
			double coupon = 0.10;
			double totalBill = calculateBill(roomRate);
			
			totalBill = calculateBill(roomRate);
			JOptionPane.showMessageDialog
			(null,  "your total is $" + totalBill);
			
			int numRooms = Integer.parseInt(JOptionPane.showInputDialog("enter the number of rooms"));
			totalBill = calculateBill(roomRate, numRooms);
			JOptionPane.showMessageDialog
			(null,  "your total with tax for " + numRooms + " rooms is $" + totalBill);
			totalBill = calculateBill(roomRate);
			
			totalBill = calculateBill(roomRate, numRooms, coupon);
			JOptionPane.showMessageDialog
			(null,  "your total with tax for " + numRooms + "room(s) is $" + totalBill + ".\nThis includes a discount of" + coupon*100 + "%");
			
			
				
	}
		//this is a peice of data for one piece data
		public static double calculateBill(double rate) {
			final float SALES_TAX = 0.13f;
			double tax = rate * SALES_TAX;
			double finalRate = rate + tax;
			finalRate = twoDecimalRounding(finalRate);
			return finalRate;
			
			
		}
		//this is a peice of data for one piece data
		public static double calculateBill(double rate, double qty){
			final float SALES_TAX = 0.13f;
			double tax = rate * SALES_TAX;
			double finalRate = rate + tax;
			finalRate = finalRate * qty;
			finalRate = twoDecimalRounding(finalRate);
			return finalRate;
		
	} //this is a method for multiple pieces of data
		public static double calculateBill(double rate, int qty, double coup){
			double tax = rate * SALES_TAX;
			double finalRate = rate + tax;
			finalRate = finalRate * (1 - coup) * qty;
			finalRate = twoDecimalRounding(finalRate);
			return finalRate;
			
		
	}
		//this method recieves a double and returns the same double rounded to two decimal points
		public static double twoDecimalRounding(double decimal){
			decimal = decimal*100;
			decimal = decimal + 0.5;
			decimal = (int)decimal;
			decimal = decimal/100;
			return decimal;
		}
					
			
		}

	/*  
	 * Here you will create four new methods:
	 * -- Three cases of the overloaded method calculateBill()
	 * -- A method called twoDecimalRounding() which will
	 * 		be called by each case of the calculateBill() method.
	 */

