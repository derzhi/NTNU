package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("------- TERNING 100 -------");
        System.out.println(" ");
        starter();
    }

    public static void starter() {
        System.out.println("Tast 1 for å starte");
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();

        if (input == 1) {
            startSpill();
        } else {
            starter();
        }
    }

    public static void startSpill() {
        Scanner in = new Scanner(System.in);

        Spiller spiller1 = new Spiller(0);
        Spiller spiller2 = new Spiller(0);

        int rundeNummer = 0;


        while(!spiller1.erFerdig() && !spiller2.erFerdig()) {

            spiller1.kastTerning();
            spiller2.kastTerning();

            rundeNummer += 1;

            System.out.println("----------------");
            System.out.println("Runde: " + rundeNummer);
            System.out.println("Spiller 1: " + spiller1.getSumPoeng());
            System.out.println("Spiller 2: " + spiller2.getSumPoeng());
        }

        System.out.println("----------------");

        if(spiller1.erFerdig()) {
            System.out.println("Spiller 1 vant!");
        } else {
            System.out.println("Spiller 2 vant!");
        }

        starter();

    }
}