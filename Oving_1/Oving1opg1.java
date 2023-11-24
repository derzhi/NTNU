import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 * Oving1opg1.java. Programmet regner ett tall om fra tommer til centimeter.
 */

public class Oving1opg1 {

  /**
   * Test.
   */
  public static void main(String[] args) {
    String tommerLest = showInputDialog(
        "Skriv inn ett tall i tommer som du vil gjøre om til centimeter");
    double tommer = Double.parseDouble(tommerLest);
    double centimeter = tommer * 2.54;

    /* Gjør om verdiene hvis verdiene er over null */
    if (tommer > 0.0) {
      showMessageDialog(null, tommer + " tommer er lik " + centimeter + "centimeter");
    } else {
      showMessageDialog(null, "Feil inndata");
    }

  }
}