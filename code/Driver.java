import java.util.Scanner;
public class Driver {
  public static void main(String[] args) {
    boolean run = true;
    while (run) {
      System.out.print("Enter product code (enter 'x' to exit): ");
      Scanner scan = new Scanner(System.in);
      String input = scan.nextLine();
      if (input.equalsIgnoreCase("x"))
        run = false;
      else
        Keyboard.sendProductCode(input);
    }
  }
}
