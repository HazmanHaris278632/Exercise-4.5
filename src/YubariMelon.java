
public class YubariMelon extends Fruit {//subclass of Fruit

	private String colour, country, taste;
	private double weight, price, discount;
	private int quantity;
	
	public YubariMelon(String name, String colour, String taste, String country, double weight, int quantity, double price) { //constructor with 7 arguments
		super(name);
		this.colour = colour;
		this.taste = taste;
		this.country = country;
		this.weight = weight;
		this.quantity = quantity;
		this.price = price;
		
		if(this.quantity <= 4) {
			totalPrice(); //overloading with no argument
			System.out.println("This fruit don't have discount!");
			System.out.println("Buy \t\t: " + this.quantity + " quantity");
			System.out.printf("Total price \t: RM%.2f",totalPrice());
			
		}
		else if(this.quantity >4 && this.quantity <=8) {
			double pr = 380;
			totalPrice(pr); //overloading with 1 argument
			System.out.println("This fruit don't have discount!");
			System.out.println("Buy \t\t: " + this.quantity + " quantity");
			System.out.printf("Total price \t: RM%.2f",totalPrice(pr));
		}
		
		else if (this.quantity >8 && this.quantity <=12){
			double pr = 360;
			double qq = this.quantity;
			totalPrice(pr,qq); //overloading with 2 arguments
			System.out.println("This fruit don't have discount!");
			System.out.println("Buy \t\t: " + this.quantity + " quantity");
			System.out.printf("Total price \t: RM%.2f",totalPrice(pr,qq));
		}
		else {
			System.out.println("Limit for 12 quantity only! This is exclusive fruit!");
		}
	}
	public double totalPrice() {//overloading method
		return this.price*this.quantity;
	}
	public double totalPrice(double pr) {//overloading method
		return pr*this.quantity;
	}
	public double totalPrice(double pr,double qq) {//overloading method
		return pr*qq;
	}  
	public String getColour() {
		return this.colour;
	}
	public String getTaste() {
		return this.taste;
	}
	public String getCountry() {
		return this.country;
	}
	public double weight() {
		return weight;
	}
	public int getQuantity() {
		return quantity;
	}
	public double getPrice() {
		return price;
	}
	public String toString() { //overriding method
		return "\nName \t\t: " + super.getName() +
				"\nColour \t\t: " + this.colour +
				"\nTaste \t\t: " + this.taste +
				"\nWeight \t\t: " + this.weight + "kg" +
				"\nCountry \t: Import from " + this.country;
			
	}
	
}
