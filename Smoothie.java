/*Class: CMSC203
 * Instructor: Dr.Alexander
 * Due 12/4/21
 * Platform compiler:
 * I pledge that I have completed the programming assignment independently
 * I have not copied the code from a student or any source
 * I have not given my code to any student
 * David Abili
 */

public class Smoothie extends Beverage {

	private boolean eProtein;
	private int eFruit;
	private final double eProteinPrice = 1.50;
	private final double eFruitPrice = 0.50 ;

	public Smoothie(String n, TYPE bT, SIZE s, int f,boolean p ) {
		super(n,bT,s);
		eProtein = p;
		eFruit = f;
	}

	public boolean getEProtein() {
		return eProtein;
	}

	public void setEFruit(int f) {
		eFruit = f;
	}

	public int getEFruit() {
		return eFruit;
	}

	public void setEProtein(boolean p) {
		eProtein = p;
	}


	public double CalcPrice() {;
	double price = 0;

	price+= getEFruit()+eFruitPrice;
	
	if(getEProtein()) {
		price += eProteinPrice;
	}

	price += SizePrice();

	return price;
	}

	public String toString() {
		return " Your " + getName() + "size " + getSize() + " is " + eFruit + " for an extra fruit " 
				+ eProtein + " for protein and has a final price of " + CalcPrice();
	}

	public boolean equals( Object o) {

		Beverage other = (Beverage) o;
		Smoothie other1 = (Smoothie) o;

		return getName().equals(other.getName())   
				&& getBevType().equals(other.getBevType()) 
				&& getSize().equals(other.getSize()) 
				&& getEFruit() == (other1.getEFruit())
				&& getEProtein() == (other1.getEProtein());
	}

}
