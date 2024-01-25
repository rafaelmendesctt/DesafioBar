package entities;

public class Bill {
	public static char gender;
	public static int beer;
	public static int barbecue;
	public static int softDrink;

	public static double cover() {
		if (feeding()>30) {
			return 0.0;
		} else {
			return 4.0;
		}
	}
	
	public static double feeding() {
		return softDrink*3+beer*5+barbecue*7;
	}
	
	public static double ticket() {
		if (gender=='F' || gender=='f') {
			return 8.0;
		} else {
			return 10.0;
		}
	}
	
	public static double total() {
		return feeding()+cover()+ticket();
	}
}