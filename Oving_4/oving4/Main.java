import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean flag = true;

        Valuta euro = new Valuta("EUR", 11.14);
        Valuta dollar = new Valuta("USD", 10.67);
        Valuta svenskeKroner = new Valuta("SEK", 0.96);

        do {
            System.out.println("Velg valuta:");
            System.out.println("1: dollar");
            System.out.println("2: euro");
            System.out.println("3: svenske kroner");
            System.out.println("4: avslutt");

            int input = in.nextInt();
            if (input == 4) {
                flag = false;
            } else {
                System.out.println("Skriv inn beløp");
                int belop = in.nextInt();

                switch (input) {
                    case 1:
                        System.out.println(belop + " " + dollar.getNavn() + " = " + dollar.tilNok(belop) + "NOK");
                        break;
                    case 2:
                        System.out.println(belop + " " + euro.getNavn() + " = " + euro.tilNok(belop) + "NOK");
                        break;
                    case 3:
                        System.out.println(belop + " " + svenskeKroner.getNavn() + " = " + svenskeKroner.tilNok(belop)+ "NOK");
                        break;
                }
            }

        } while (flag);
    }
}
