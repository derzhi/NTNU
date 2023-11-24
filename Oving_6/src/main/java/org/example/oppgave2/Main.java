package org.example.oppgave2;

import java.util.Scanner;

public class Main {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            String input;
            System.out.println("Skriv inn tekst som skal analyseres: ");
            input = in.nextLine();
            Tekstanalyse tekst = new Tekstanalyse(input);

            tekst.forskjelligeBokstaver();
            tekst.totalBokstaver();
            tekst.prosentIkkeBokstaver();

            System.out.println("Hvilken bokstav vil du sjekke antall forekomster av? ");
            input = in.nextLine();
            tekst.antallForekomster(input.charAt(0));
            tekst.flestForekomster();
        }
    }
}
