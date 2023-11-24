package org.example.oppgave1;

import java.util.Scanner;

public class Oppgave1 {
    private static java.util.Random random = new java.util.Random();
    private static java.util.Scanner in = new Scanner(System.in);



    public static void main(String[] args) {
        int[] antall = new int[10];

        System.out.println("Skriv inn antall forekomster: ");

        int gjenta = in.nextInt();

        for(int i = 0; i < gjenta; i++) {
            int randomInt = random.nextInt(10);
            antall[randomInt] += 1;
        }

        for(int i = 0; i < antall.length; i++) {
            int antallGanger = antall[i];
            String result = String.format("%d - %d", i, antallGanger);
            System.out.println(result);
        }
    }


}
