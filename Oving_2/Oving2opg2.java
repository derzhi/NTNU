/**
 * Øving 2, oppgave 2.
 */
public class Oving2opg2 {
  /**
   * Programmet sammenligner kr/g pris på kjøttdeig A og kjøttdeig B og viser det
   * billigste alternativet.
   */
  public static void main(String[] args) {

    // setter av pris og vekt på hver vare
    double prisA = 35.90;
    double prisB = 39.50;
    double gramA = 450;
    double gramB = 500;

    // regner ut kr/g
    double kronerPerKiloA = prisA / gramA;
    double kronerPerKiloB = prisB / gramB;

    // lagrer kjøttdeigen med minst pris som billigst vare
    String billigsteVare = kronerPerKiloA > kronerPerKiloB ? "Kjøttdeig B" : "Kjøttdeig A";

    // skriver ut den billigste varen til konsollen
    System.out.println(billigsteVare + " er den billigste varen");
  }
}
