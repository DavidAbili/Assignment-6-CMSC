
public abstract class Beverage {

	private String name;
	private TYPE bevType;
	private SIZE size;
	private final double bPrice = 2.0;
	private int sPrice = 1;
	private int mPrice = 2;
	private int lPrice = 3;

	public Beverage(String n, TYPE bT, SIZE s) {
		size = s;
		name = n;
		bevType = bT;

	}

	public TYPE getBevType() {
		return bevType;
	}

	public SIZE getSize() {
		return size;
	}

	public String getName() {
		return name;
	}

	public void setBevType(TYPE bT) {
		bevType = bT;
	}

	public void setSize(SIZE s) {
		size = s;
	}

	public void setName(String n) {
		name = n;
	}

	public double SizePrice() {
		double price = 0;
		if(size.equals(SIZE.SMALL)) {
			price += sPrice;
		} else if (size.equals(SIZE.MEDIUM)) {
			price += mPrice;
		}	else if(size.equals(SIZE.LARGE)) {
			price += lPrice;
		} else {
			price = 0;
		}

		return price;
	}

	public abstract double CalcPrice();

	public String toString() {
		return " Your " + bevType + " is a " + size;
	}

	public boolean equals( Object o) {

		Beverage other = (Beverage) o;

		return getName().equals(other.getName())   
				&& getBevType().equals(other.getBevType()) 
				&& getSize().equals(other.getSize());
	}
}
