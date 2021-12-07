
public class Alcohol extends Beverage {

	private boolean oWeekend;

	private final double oWeekendPrice = 0.60;


	public Alcohol(String n, TYPE bT, SIZE s, boolean w) {
		super(n,bT,s);
		oWeekend = w;

	}

	public boolean getOWeekend() {
		return oWeekend;
	}

	public void setOWeekend(boolean w) {
		oWeekend = w;
	}


	public double CalcPrice() {;
	double price = 0;

	if(getOWeekend()) {
		price += oWeekendPrice;
	}

	price += SizePrice();

	return price;
	}

	public String toString() {
		return " Your " + getName() + "size " + getSize() + " is " + oWeekend + " for weekend exclusive" 
				+ " and has a final price of " + CalcPrice();
	}

	public boolean equals( Object o) {

		Beverage other = (Beverage) o;
		Alcohol other1 = (Alcohol) o;

		return getName().equals(other.getName())   
				&& getBevType().equals(other.getBevType()) 
				&& getSize().equals(other.getSize()) 
				&& getOWeekend() == (other1.getOWeekend());
	}

}
