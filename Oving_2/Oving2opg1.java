import java.util.Scanner;

/**
 * Øving 2, oppgave 1.
 */
public class Oving2opg1 {
  /**
   * Programmet sjekker om et år er et skuddår.
   */
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Skriv inn ett årstall");

    // validerer om verdien er en integer
    if (in.hasNextInt()) {
      int aar = in.nextInt();

      // validerer om veriden ligger over null
      if (aar > 0) {
        // sjekker om året er et skuddår
        if (aar % 4 == 0 && aar % 100 != 0 || aar % 100 == 0 && aar % 400 == 0) {
          System.out.println("Årstallet er et skuddår");
        } else {
          System.out.println("Årstallet er ikke et skuddår");
        }

      } else {
        System.out.println("Årstallet må være større enn null");
      }

    } else {
      System.out.println("Ugyldig inndata");
    }

    in.close();
  }
}
