
public class GreenApple extends Apple {//subclass for Apple

	private String country, taste;

	public GreenApple(String name, String colour, String taste, String country, double weight, double price) {
		super(name,colour,weight, price);
		this.country = country;
		this.taste = taste;	
	
	}
	public String getCountry() {
		return this.country;
	}
	public String getTaste() {
		return this.getTaste();
	}

	public String toString() { //overriding method
		return "\nName \t\t: " + super.getName() +
				"\n" + "Colour \t\t: " + super.getColour() +
				"\nTaste \t\t: " +this.taste +
				"\nCountry \t: Import from " + this.country;
				
				
				
	}

}
