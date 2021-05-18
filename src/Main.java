
public class Main {
	
	public static void main(String[] args) {
		
		//Fruit f = new Fruit("Orange"); //no need new object for super class
		
		System.out.println();
		
		Apple a = new Apple("Apple", "Red & Green",10, 2.00); //new object for sub class
		System.out.println(a);				
		
		RedApple b = new RedApple("Red Apple", "Red", "Sweet", "USA", 60, 2.50);
		System.out.println(b);
		
		GreenApple c = new GreenApple("Green Apple", "Green", "Sweet-Sour", "South Korea", 100, 3.50);
		System.out.println(c);

		YubariMelon d = new YubariMelon("Yubari Melon", "Yellow", "Really sweet", "Hokkaido, Japan", 1.6, 8, 400);
		System.out.println(d);
		
		Durian e = new Durian("Black Thorn", "Yellow", "Really Sweet", "Penang, Malaysia", 4, 15, 90);
		System.out.println(e);
	}
}