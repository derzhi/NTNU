import java.util.Scanner;
/**
 * Øving 3, oppgave 1.
 */
public class Oving3opg1 {

  public static void main(String[] args) {
    int inNum1;
    int inNum2;

    Scanner in = new Scanner(System.in);

    do {
      System.out.println("Skriv in første tall");
      inNum1 = in.nextInt();

      // validate that inNum1 is greater than zero
    } while (inNum1 <= 0);

    do {
      System.out.println("Skriv in andre tall");
      inNum2 = in.nextInt();

      // validate that inNum2 is greater than inNum2
    } while (inNum2 < inNum1);

    multiplicationTables(inNum1, inNum2);

  }

  // method for generating 10-multiplication tables from a number to a second number
  public static void multiplicationTables(int num1, int num2) {
    while(num1 <= num2) {
      for(int i = 1; i <= 10; i++) {
        System.out.println(num1 + " * " + i + " = " + num1 * i);
      }
      num1++;
      System.out.println("--------------------------");
    }
  }
}
