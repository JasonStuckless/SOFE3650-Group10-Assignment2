import java.util.HashMap;

public class Session {
    double calculate = 0;
	HashMap<String, Float> checkout = new HashMap<String, Float>();
	public void addProduct(String productName, float productPrice ) {
	    checkout.put(productName, productPrice);
	    calculate += productPrice;
	    System.out.println(checkout);
	}
	public void remove(String name)	{
		double val = checkout.get(name);
		checkout.remove(name);
		calculate -= val;
	}
	public double total()	{
		return calculate;
	}
}
