import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 * oppgave2. Programmet regner om timer, minutter og sekunder til totalt antall
 * sekunder.
 */
public class Oving1opg2 {

  /**
   * Test.
   */
  public static void main(String[] args) {
    String timerLest = showInputDialog("Skriv in antall timer");
    String minutterLest = showInputDialog("Skriv in antall minutter");
    String sekunderLest = showInputDialog("Skriv in antall sekunder");

    int timer = Integer.parseInt(timerLest) * 3600;
    int minutter = Integer.parseInt(minutterLest) * 60;
    int sekunder = Integer.parseInt(sekunderLest);
    int sekunderTotal = timer + minutter + sekunder;

    /* Gjør om verdiene hvis verdiene er over null */
    if (timer >= 0 && minutter >= 0 && sekunder >= 0) {
      showMessageDialog(null, timerLest + " timer, " + minutterLest + " minutter og " + sekunderLest
          + " sekunder er tilsammen lik " + sekunderTotal + " sekunder");
    } else {
      showMessageDialog(null, "Feil inndata");
    }

  }
}