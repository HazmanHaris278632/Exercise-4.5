
public class Apple extends Fruit implements calcPrice {
	
	private String colour;
	protected double price, weight, discount, totalDiscount;
	
	
	public Apple(String name, String colour, double weight, double price) {//subclass
		super(name);
		this.colour = colour;
		this.weight = weight;
		this.price = price;
		calcPrice();
	}
	public void calcPrice() {
		if(this.weight <= 3) {
			totalPrice();
			System.out.printf("Buy \t\t: %.2fkg",this.weight);
			System.out.printf("\nTotal price \t: RM%.2f",totalPrice());
			
		}
		else if(this.weight > 3 && this.weight <=10) {
			double pr = 5.00;
			discount = 0.2;
			totalPrice(pr);
			System.out.printf("Buy \t\t: %.2fkg",this.weight);
			System.out.printf("\nTotal price \t: RM%.2f",totalPrice(pr));
		}
		
		else{
			double pr = 2.50;
			double w = this.weight;
			discount = 0.3;
			totalPrice(pr,qq);
			System.out.printf("Buy \t\t: %.2fkg",this.weight);
			System.out.printf("\nTotal price \t: RM%.2f",totalPrice(pr,w));
		}
	}
	public double totalPrice() {//overloading method
		return this.price*this.weight;
	}
	
	public double totalPrice(double pr) {//overloading method
		return pr*this.weight*(1-discount);
	}
	
	public double totalPrice(double pr,double w) {//overloading method
		return pr*w*(1-discount);
	}  
	public double weight() {
		return weight;
	}
	
	public String getColour(){
		return this.colour;
	}
	
	public String toString() { //overriding method-dif classes
		return "\nFruit name      : " + super.getName() +
			   "\n" + "Colour \t\t: " + this.getColour();
		
	}

}
	

	 
