import java.util.Scanner;

/**
 * Øving 3, oppgave 2.
 */
public class Oving3opg2 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    do{
      System.out.println("Write a number. I will check if it is a prime number.");
      int number = in.nextInt();

      String result = checkPrime(number) ? " is a prime number " : " is not a prime number";
      System.out.println(number + result);

    } while(true);

  }

  public static boolean checkPrime(int num) {
    if(num <= 1) {
      return false;
    }

    for(int i = 2; i < num; i++) {
        if (num % i == 0) {
          return false;
        }
    }

    return true;
  }

}
