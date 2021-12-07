/*Class: CMSC203
 * Instructor: Dr.Alexander
 * Due 12/4/21
 * Platform compiler:
 * I pledge that I have completed the programming assignment independently
 * I have not copied the code from a student or any source
 * I have not given my code to any student
 * David Abili
 */
public class Coffee extends Beverage {

	private boolean eShot;
	private boolean eSyrup;
	private final double eShotPrice = 0.50;
	private final double eSyrupPrice = 0.50 ;
	
	public Coffee(String n, TYPE bT, SIZE s, boolean sh, boolean sy) {
		super(n,bT,s);
		eShot = sh;
		eSyrup = sy;
	}
	
	public boolean getEShot() {
		return eShot;
	}

	public void setESyrup(boolean sy) {
		 eSyrup = sy;
	}
	
	public boolean getESyrup() {
		return eSyrup;
	}

	public void setEShot(boolean sh) {
		 eShot = sh;
	}

	
	public double CalcPrice() {;
	double price = 0;
	
	if(getEShot()) {
		price += eShotPrice;
	}
	
	if(getESyrup()) {
		price += eSyrupPrice;
	}
	
	price += SizePrice();
	
	return price;
	}

	public String toString() {
		return " Your " + getName() + "size " + getSize() + " is " + eShot + " for an extra shot " 
	+ eSyrup + " for extra syrup and has a final price of " + CalcPrice();
	}

	public boolean equals( Object o) {

		Beverage other = (Beverage) o;
		Coffee other1 = (Coffee) o;

		return getName().equals(other.getName())   
				&& getBevType().equals(other.getBevType()) 
				&& getSize().equals(other.getSize()) 
				&& getEShot() == (other1.getEShot())
				&& getESyrup() == (other1.getESyrup());
	}
	
}
