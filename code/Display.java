import javax.swing.*;        

public class Display {
  static JFrame frameStart = new JFrame("StartSession");
  static JFrame frameScan = new JFrame("Scan");
  static int defaultHeight = 400;
  static int defaultWidth = 400;
  static DefaultListModel<String> display = new DefaultListModel<>();

  public static void createFrameScan() {
    JLabel label = new JLabel("<html>Start scanning the products</html>");
    frameScan.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frameScan.setVisible(false);
    frameScan.setLayout(null);
    frameScan.setSize(defaultHeight,defaultWidth);
    JList<String> list = new JList<>(display);
    list.setBounds(0,40,400,400);
    label.setBounds(10,20,400,30);
    frameScan.add(list);
    frameScan.add(label);
    Keyboard.initKeyboard(frameScan);
  }
  
  public static void addToDisplay(String item) {
    display.addElement(item);
  }

  public static void removeFromDisplay(String item) {
    display.removeElement(item);
  }

  public static void createFrameStart() {
    frameStart.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JLabel label = new JLabel("<html><font size=33>CashRegister</font></html>");
    JLabel labelInstruction = new JLabel("Press enter to start a new session");
    frameStart.setLayout(null);
    label.setBounds(50,0,400, 100);
    labelInstruction.setBounds(50, 140, 200, 200);
    frameStart.getContentPane().add(label);
    frameStart.getContentPane().add(labelInstruction);
    frameStart.setSize(defaultHeight,defaultWidth);
    frameStart.setVisible(true);
    Keyboard.initKeyboard(frameStart);
  }

  public static void startScanning() {
    hideAllFrames();
    frameScan.setVisible(true);
    frameScan.requestFocus();
  }

  public static void hideAllFrames() {
    frameStart.setVisible(false);
    frameScan.setVisible(false);
  }

  public static void displayProductInfo(String productName, String productPrice) {
    addToDisplay(productName + "        "  + productPrice);
    System.out.println("Product Name: " + productName + "\nProduct Price: " + productPrice);
  }
}
