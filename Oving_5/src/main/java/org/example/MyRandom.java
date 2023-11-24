package org.example;

import java.util.Random;
import java.util.Scanner;

public class MyRandom {
    private static Random random = new Random();
    private static MyRandom myRandom = new MyRandom();
    private static Scanner in = new Scanner(System.in);

    public int nextWholeNumber(int min, int max) {
        return min + random.nextInt(max - min + 1);
    }

    public double nextDecimal(double min, double max) {
        return min + random.nextDouble()*(max - min);
    }

    public static void main(String[] args) {

        while(true) {
            System.out.println("Tast 1 for heltall");
            System.out.println("Tast 2 for desimaltall");
            System.out.println("Tast 3 for å avslutte programmet");
            int input = in.nextInt();

            if (input == 3) break;

            System.out.println("Tast inn nedre grense til intervallet");
            double min = in.nextDouble();
            System.out.println("Tast inn ovre grense til intervallet");
            double max = in.nextDouble();

            System.out.println("Skriv inn antallet ganger tallet skal genereres");
            int amount = in.nextInt();

            if(input == 1) {
                for(int i = 0; i < amount; i++) {
                    System.out.println(myRandom.nextWholeNumber((int)min, (int)max));
                }
            } else if( input == 2) {
                for(int i = 0; i < amount; i++) {
                    System.out.println(myRandom.nextDecimal(min, max));
                }
            }
        }
    }
}
