
public class Apple extends Fruit {
	
	private String colour;
	protected double price, weight, discount, totalDiscount;
	
	
	public Apple(String name, String colour, double weight, double price) {//contsructor with 4 argments
		super(name);
		this.colour = colour;
		this.weight = weight;
		this.price = price;
	
		if(this.weight <= 5) {
			totalPrice(); //overloading with no argument
			System.out.printf("Buy \t\t: %.2fkg",this.weight);
			System.out.printf("\nTotal price \t: RM%.2f",totalPrice());
			
		}
		else if(this.weight > 5 && this.weight <=25) {
			double pr = 5.00; //beli lebih dari 5kg kurang/sama daripada 25kg, RM5.00
			totalPrice(pr); //overloading with 1 argument
			System.out.printf("Buy \t\t: %.2fkg",this.weight);
			System.out.printf("\nTotal price \t: RM%.2f",totalPrice(pr));
		}
		
		else{ //have discount rate
			double pr = 2.50; //beli lebih dari 25kg, RM2.50
			double q;

			System.out.printf("Buy \t\t: %.2fkg",this.weight);
			if(name == "Apple" || name == "Red apple") {
				
				Discount aa = new AppleDiscount(); //create new object for Apple Discount
				System.out.println("\nDiscount \t: " + aa.rateofDiscount());
				q = aa.rateofDiscount();
				double discount = aa.rateofDiscount();
				totalPrice(discount,pr);
			}
			else {
				Discount aa = new RedAppleDiscount(); //create new object for Red Apple Discount
				System.out.println("\nDiscount \t: " + aa.rateofDiscount());
				q = aa.rateofDiscount();
				double discount = aa.rateofDiscount();
				totalPrice(discount,pr); //overloading with 2 arguments
			}
				System.out.println("\n-----Sales! Buy more than 25kg, have special discount!----");
				System.out.printf("Total price \t: RM%.2f",totalPrice(q,pr));
			}
}
	
	public double totalPrice() {//overloading method
		return this.price*this.weight;
	}
	
	public double totalPrice(double pr) {//overloading method
		return price*this.weight;
	}
	
	public double totalPrice(double discount,double pr) {//overloading method
		double grandtotal = pr*this.weight;
		double sales = discount*grandtotal;
		return grandtotal-sales;
	}  
	public double weight() {
		return weight;
	}
	
	public String getColour(){
		return this.colour;
	}
	
	public String toString() { //overriding method 
		return "\nFruit name      : " + super.getName() +
			   "\n" + "Colour \t\t: " + this.getColour();
		
	}

}
	