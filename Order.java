import java.util.ArrayList;


/*Class: CMSC203
 * Instructor: Dr.Alexander
 * Due 12/4/21
 * Platform compiler:
 * I pledge that I have completed the programming assignment independently
 * I have not copied the code from a student or any source
 * I have not given my code to any student
 * David Abili
 */

public class Order implements OrderInterface {

	private DAY oDay;
	private double oNum;
	private double oTime;
	private  Customer c;
	private ArrayList <Beverage> bList = new ArrayList<Beverage>();
	//Beverage b = new Coffee("s",TYPE.COFFEE,SIZE.LARGE,false,false);
	public Order(DAY d, double t, Customer c) {
		oDay = d;
		oNum = (Math.random()* (90000-10000+1)+10000);
		oTime = t;
		this.c = c;
	}
	
	public Order() {
		
	}

	@Override
	public boolean isWeekend() {
		boolean val = false;
		if (oDay == (DAY.SATURDAY) || oDay.equals(DAY.SUNDAY) )
		val = true;
			return val;
	}

	@Override
	public Beverage getBeverage(int itemNo) {
		// TODO Auto-generated method stub
		
			
		return bList.get(itemNo);
	}

	@Override
	public void addNewBeverage(String bevName,TYPE type, SIZE size, boolean extraShot, boolean extraSyrup) {
		
		Beverage c = new Coffee(bevName,type,size,extraShot,extraSyrup);
		bList.add(c);
	}

	@Override
	public void addNewBeverage(String bevName, TYPE type, SIZE size, boolean Weekend) {
		Beverage a = new Alcohol(bevName,type,size,Weekend);
		bList.add(a);
		
	}

	@Override
	public void addNewBeverage(String bevName, TYPE type, SIZE size, int numOfFruits, boolean addPRotien) {
		Smoothie s = new Smoothie(bevName,type,size,numOfFruits,addPRotien);
		bList.add(s);
		
	}

	@Override
	public double calcOrderTotal() {
		// TODO Auto-generated method stub
		double pr = 0;

		for(int i = 0; i< bList.size(); i++)
		pr += bList.get(i).CalcPrice();
	
		return pr;
	}

	@Override
	public int findNumOfBeveType(TYPE type) {
		// TODO Auto-generated method stub
		int num = 0;
		for(int i = 0; i < bList.size(); i++) {
			if(bList.get(i).getBevType() == type)
			num++;	
				
		}
		return num;
	}

	public String toString() {
		
		
		return c + "your order number is " + oNum + " the day you made you order is" + oDay
				+ " the time you made your order is " + oTime;
	}

}
