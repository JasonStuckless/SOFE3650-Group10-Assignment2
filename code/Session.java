import java.util.ArrayList;

public class Session {
  static double calculate = 0;
  static ArrayList<String> checkout = new ArrayList<String>();
  static ArrayList<Double> price = new ArrayList<Double>();
  static boolean started = false;

  public static Boolean isSessionStarted() {
    return started;
  }

  public static void addProduct(String productName, double productPrice ) {
    checkout.add(productName);
    price.add(productPrice);
    calculate += productPrice;
  }

  public static void remove()	{
    int size = checkout.size();
    checkout.remove(size-1);
    int last = price.size();
    double rm = price.get(last-1);
    calculate -= rm;
  }

  public static double total()	{
    return Math.round(calculate);
  }

  public static void start()	{
    checkout.clear();
    started = true;
  }
  public static void end() {
    started = false;
  }
}
