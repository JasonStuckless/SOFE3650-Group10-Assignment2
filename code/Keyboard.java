import javax.swing.*;        
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Keyboard {
  public static void initKeyboard(JFrame frame) {
    frame.addKeyListener(new KeyAdapter() {
      public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        if (keyCode == KeyEvent.VK_ENTER) {
          System.out.println("New session");
          Session.start();
          Display.start();
        } else if (keyCode == KeyEvent.VK_X) {
          Session.remove();
          Display.remove();
          System.out.println("Delete");
        }
        else {
          sendProductCode(e.getKeyText(keyCode));
          System.out.println(e.getKeyText(keyCode));
        }
      }
    });
  }

  public static void sendProductCode(String productCode) {
    CashRegister.searchDatabase(productCode);
  }
}
