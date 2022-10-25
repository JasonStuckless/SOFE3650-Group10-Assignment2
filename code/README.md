## Cash Register Use Case

This code is an implementation of Cash Register use case using Java and Swing.
It demonstrates the interface of Cash Register using keyboard and Scanner. The
operator can start a new session and begin to scan the products. Once scanned,
the products is added to the Cash Register, and the final amount is calculated
and displayed. The operator can also delete the last item using the keyboard.

### Description of the files

| File | Description |
| ----------- | ----------- |
| Application.java | Main program to simulate the GUI |
| Display.java | Simulate the display by adding/removing texts such as the product and price|
| CashRegister.java | Fetch the product and price once scanned |
| Keyboard.java | Listen the keyboard to receive the products and other commands |
| Session.java | Handle a session: start, add and remove products, calculate the total amount |
| products.txt | Local product's database |

### Compiling and Running

```
$ javac *.java
$ java Application
```

In the first screen, hit enter to start a new session. To simulate the scanner,
hit the numbers from 1 to 4 to add the products to the list. You can add as
many products as you want. if you need to remove a product, hit 'x' in the
keyboard. Once the "scanning" is done, hit "enter" again to finish the session
and proceed to checkout. During the transitions, you can check the console for
messages about the application internals.


### Application demo

1. The application is initialized and wait for the operator to start a new
   session. The product's datbase is loaded from the local file products.txt

2. When a new session is started, the operator scan the barcodes to add items,
   and the total amount is calculated and displayed in the screen. You can
   simulate the scanner by pressing the keys in the keyboard to add items (1
   for Bananas, 2 to Apples etc).

3. The operator can delete an item by pressing 'x' in the keyboard.
