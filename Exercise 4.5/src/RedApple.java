import java.util.Scanner;
public class RedApple extends Apple {//subclass for Apple
	Scanner s = new Scanner(System.in);
	private String country, taste;

	public RedApple(String name, String colour, String taste, String country, double weight, double price) {
		super(name,colour,weight,price);
		this.country = country;
		this.taste = taste;
	}
	public String getCountry() {
		return this.country;
	}
	public String getTaste() {
		return this.taste;
	}
	public String toString() { //overriding method
		return "\nName \t\t: " + super.getName() +
				"\nColour \t\t: " + super.getColour() +
				"\nTaste \t\t: " + this.taste +
				"\nCountry \t: Import from " + this.country;
				
				
				
	}

}
