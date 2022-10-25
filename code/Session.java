import java.util.ArrayList;

public class Session {
    double calculate = 0;
	ArrayList<String> checkout = new ArrayList<String>();
	ArrayList<Double> price = new ArrayList<Double>();
	public void addProduct(String productName, double productPrice ) {
	    checkout.add(productName);
	    price.add(productPrice);
	    calculate += productPrice;
	}
	public void remove()	{
		int size = checkout.size();
		checkout.remove(size);
		int last = price.size();
		double rm = price.get(last);
		calculate -= rm;
	}
	public double total()	{
		return calculate;
	}
	public void start()	{
	checkout.clear();
	}
}
