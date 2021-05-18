
public abstract class Fruit { //define super class as abstract class
	private String name;

	
	
	public Fruit(String name) { //constructor with argument
		this.name = name;
		System.out.println("\n\t===== "+this.name+" constructor is invoked =====");
	}
	public String getName() {
		return this.name;
	}
	public abstract double totalPrice();
	public abstract String toString();
}