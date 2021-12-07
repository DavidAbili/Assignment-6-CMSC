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

public class BevShop implements BevShopInterfce {


	private int nDrinks = 0;
	private static int numAL = 0;
	private ArrayList <Order> oList = new ArrayList<Order>();
private Order ordering;
	@Override
	public boolean validTime(int time) {
		// TODO Auto-generated method stub
		boolean val = false;
		if(!(time > 8 && time < 23)) {
			val = true;
		}
		return val;
	}

	@Override
	public boolean eligibleForMore() {
		// TODO Auto-generated method stub
	boolean val = false;
		if(!(numAL == 3)) {
			val = true;
		}
		return val;
	}

	@Override
	public boolean validAge(int age) {
		// TODO Auto-generated method stub
		boolean val = false;
		if(age > 20)
		val = true;
		return val;
	}

	@Override
	public void startNewOrder(int time, DAY day, String customerName, int customerAge) {
	
		Customer c = new Customer(customerName,customerAge);
		
		ordering = new Order(day, time, c);
		oList.add(ordering);
	}

	@Override
	public void processCoffeeOrder(String bevName,TYPE type, SIZE size, boolean extraShot, boolean extraSyrup) {
		// TODO Auto-generated method stub
		//Coffee c = new Coffee(bevName,type,size,extraShot,extraSyrup);
		ordering.addNewBeverage(bevName,type,size,extraShot,extraSyrup);
	}

	@Override
	public void processAlcoholOrder(String bevName, TYPE type, SIZE size, boolean Weekend) {
		// TODO Auto-generated method stub
		//Alcohol a = new Alcohol( bevName, type, size, Weekend);
		ordering.addNewBeverage(bevName,type,size, Weekend);
		numAL++;
	}

	@Override
	public void processSmoothieOrder(String bevName, TYPE type, SIZE size, int numOfFruits, boolean addPRotien) {
		// TODO Auto-generated method stub
	//	Smoothie s = new Smoothie(bevName,type,size,numOfFruits,addPRotien);
	    ordering.addNewBeverage(bevName,type,size, numOfFruits,addPRotien);
	}

	
	
	@Override
	public int findOrder(int orderNo) {
		// TODO Auto-generated method stub
		int in = 0;
		for(int i = 0; i < oList.size(); i++ ) {
			if(oList.get(orderNo).calcOrderTotal() == orderNo)
				in = i;
		}
		return 0;
	}

	@Override
	public double totalOrderPrice(int orderNo) {
		// TODO Auto-generated method stub
		return oList.get(orderNo).calcOrderTotal();
	}

	@Override
	public double totalMonthlySale() {
		// TODO Auto-generated method stub
		double s = 0;
		for(int i = 0; i < oList.size(); i++ ) {
			
			s += totalOrderPrice(i);
		}
		return s;
	}

	@Override
	public void sortOrders() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Order getOrderAtIndex(int index) {
		// TODO Auto-generated method stub
		return oList.get(index);
	}

	public int getNumOfAlcoholDrink() {
		// TODO Auto-generated method stub
		return numAL;
	}

	public Order getCurrentOrder() {
		// TODO Auto-generated method stub
		
		return ordering;
	
	}

}
