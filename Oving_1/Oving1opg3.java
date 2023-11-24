import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 * Oving1opg3.java Programmet regner om sekunder til antall timer, minutter og
 * sekunder.
 */
public class Oving1opg3 {
  /**
   * Metode main.
   */
  public static void main(String[] args) {
    String sekunderLest = showInputDialog("Skriv in antall sekunder");

    int sekunderTotal = Integer.parseInt(sekunderLest);
    int timer = sekunderTotal / 3600;
    int minutter = (sekunderTotal - timer * 3600) / 60;
    int sekunder = sekunderTotal - timer * 3600 - minutter * 60;

    /* Gjør om verdiene hvis verdiene er over null */
    if (sekunderTotal > 0) {
      showMessageDialog(null, sekunderLest + " sekunder er lik: " + timer + " timer, " + minutter
          + " minutter og " + sekunder + " sekunder");
    } else {
      showMessageDialog(null, "Feil inndata");
    }

  }
}