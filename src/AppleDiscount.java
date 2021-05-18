
public class AppleDiscount implements Discount {
	public float rateofDiscount() {
		return 0.30f;
	}
}
class RedAppleDiscount implements Discount {
	public float rateofDiscount() {
		return 0.20f;
	}
}
class GreenAppleDiscount implements Discount {
	public float rateofDiscount() {
		return 0.10f;
	}
}

