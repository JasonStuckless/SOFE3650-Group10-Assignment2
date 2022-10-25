## Cash Register Use Case

This code is an implementation of Cash Register use case using Java and Swing.
It demonstrates the interface of Cash Register using keyboard and Scanner. The
operator can start a new session and begin to scan the products. Once scanned,
the products is added to the Cash Register, and the final amount is calculated
and displayed. The operator can also delete the last item using the keyboard.

### Description of the files


### Compiling and Running

```
$ javac *.java
$ java Application
```

### Application demo

| File | Description |
| ----------- | ----------- |
| Application.java | Main program to simulate the GUI |
| Display.java | Simulate the display by adding/removing texts such as the product and price|
| CashRegister.java | Fetch the product and price once scanned |
| Keyboard.java | Listen the keyboard to receive the products and other commands |

