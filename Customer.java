
public class Customer {

	private String name;
	private int age;
	
	public Customer(String n, int a) {
		name = n;
		age = a;
	}
	
	public Customer() {
		name = "none";
		age = 0;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int a) {
		age = a;
	}
	
	public String toString() {
		return name + " is age " + age;
	}
}
