import java.util.ArrayList;

public class Session {
    double calculate = 0;
	ArrayList<String> checkout = new ArrayList<String>();
	public void addProduct(String productName, float productPrice ) {
		String concatProduct = productName + productPrice;
	    checkout.add(concatProduct);
	    calculate += productPrice;
	}
	public void remove()	{
		double val = checkout.size();
		checkout.remove(val);
		calculate -= val;
	}
	public double total()	{
		return calculate;
	}
	public void start()	{
	checkout.clear();
	}
}
