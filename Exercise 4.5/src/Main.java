
public class Main {

	public static void main(String[] args) {
		Apple a = new Apple("Apple", "Green & Red", 5, 10);
		System.out.println(a);
		
		GreenApple b = new GreenApple("Green Apple", "Green", "Sweet-Sour", "South Korea", 15, 5);
		System.out.println(b);
		
		RedApple c = new RedApple("Red Apple", "Red", "Sweet", "United States", 7, 5);
		System.out.println(c);
		
		YubariMelon d = new YubariMelon("Yubari Melon", "Yellow", "Really sweet", "Hokkaido, Japan", 1.6, 6, 400);
		System.out.println(d);
		
		Durian e = new Durian("Black Thorn", "Yellow", "Really Sweet", "Penang, Malaysia", 4, 10, 90);
		System.out.println(e);
		
		

	}

}
