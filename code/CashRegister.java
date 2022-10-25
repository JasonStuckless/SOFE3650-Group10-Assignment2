import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CashRegister {
  public static void searchDatabase(String productCode) {
    List<String> productInfoList = new ArrayList<String>();

    String productName = "";
    String productPrice = "";
    Scanner scan = null;

    try {
      scan = new Scanner(new
          FileReader("products.txt")).useDelimiter("\\s");
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }

    String str;
    while (scan.hasNext()) {
      str = scan.next();
      // adding each string to arraylist
      productInfoList.add(str);
    }

    String[] productArray = productInfoList.toArray(new String[0]);
    for (int i = 0; i < productArray.length; i = i + 3) {
      if (productArray[i].equals(productCode)) {
        productName = productArray[i + 1];
        productPrice = productArray[i + 2];
        break;
      }
    }

    Display.displayProductInfo(productName, productPrice);
  }
}
