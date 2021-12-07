/*Class: CMSC203
 * Instructor: Dr.Alexander
 * Due 12/4/21
 * Platform compiler:
 * I pledge that I have completed the programming assignment independently
 * I have not copied the code from a student or any source
 * I have not given my code to any student
 * David Abili
 */


public class BevShopNoGUITest {

	public static void main(String[] args) {

		int tempAge, tempOrderNo;

		Customer tempCustomer;
		int anInvalidTime = 8, anotherInvalidTime = 24;

		BevShop b = new BevShop();

		System.out.println("Start a new order"); // Start a new order
		b.startNewOrder(12, DAY.MONDAY, "John", 23);


		System.out.println("Add alcohol drink"); 
		b.processAlcoholOrder("Mohito",TYPE.ALCOHOL, SIZE.SMALL, false);
	

		System.out.println("Total on the Order:" + b.getCurrentOrder().calcOrderTotal()); 
		System.out.println(b.eligibleForMore()); 

		System.out.println("Add second alcohol drink"); 
		// drink
		b.processAlcoholOrder("tonic", TYPE.ALCOHOL ,SIZE.LARGE,true);
		System.out.println("Total on the Order:" + b.getCurrentOrder().calcOrderTotal()); 
		System.out.println(b.getNumOfAlcoholDrink());

		System.out.println("Add third alcohol drink"); 
		b.processAlcoholOrder("wine",TYPE.ALCOHOL, SIZE.SMALL, true);

		System.out.println("Total on the Order:" + b.getCurrentOrder().calcOrderTotal()); 

		System.out.println(b.getNumOfAlcoholDrink()); 

		System.out.println("Add a COFFEE to order"); 
		b.processCoffeeOrder("cappuchino",TYPE.COFFEE, SIZE.SMALL, true, true);
		System.out.println(b.getNumOfAlcoholDrink()); 

		System.out.println("Total on the Order:" + b.getCurrentOrder().calcOrderTotal()); 



		System.out.println("Start a new order"); 

		b.startNewOrder(10, DAY.SUNDAY, "Mary", 12);

		System.out.println("Add a SMOOTHIE to order"); 
		b.processSmoothieOrder("Morning Boost",TYPE.SMOOTHIE, SIZE.LARGE, 2, true);
		System.out.println("Total on the Order:" + b.getCurrentOrder().calcOrderTotal());
		System.out.println("Add a COFFEE to order");
		b.processCoffeeOrder("Latte", TYPE.COFFEE,SIZE.MEDIUM, false, false);
		System.out.println("Total on the Order:" + b.getCurrentOrder().calcOrderTotal()); 
		System.out.println(b.getNumOfAlcoholDrink()); 

		int numOfFruits = 5;

		b.processSmoothieOrder("Detox", TYPE.SMOOTHIE ,SIZE.LARGE, numOfFruits, false);
		System.out.println("Total on the Order:" + b.getCurrentOrder().calcOrderTotal()); 
		System.out.println("Total amount for all orders:" + b.totalMonthlySale()); 
	}

}
