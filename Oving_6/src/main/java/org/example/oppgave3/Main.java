package org.example.oppgave3;

public class Main {
    public static void main(String[] args) {
        double[][] A = {{1, 2}, {3, 4}, {5, 6}};
        double[][] B = {{1, 2, 3}, {4, 5, 6}};

        Matrise matriseA = new Matrise(A);
        Matrise matriseB = new Matrise(B);

        Matrise addereMatrise = matriseA.adderMatrise(matriseB);
        Matrise produktMatrise = matriseA.multipliserMatrise(matriseB);
        Matrise transponertMatrise = matriseA.transponerMatrise();

        if (addereMatrise != null) {
            System.out.println("Sum av matrisene:");
            addereMatrise.printMatrise();
        } else {
            System.out.println("Summering av matrisene er umulig");
        }

        if (produktMatrise != null) {
            System.out.println("Produkt av matrisene");
            produktMatrise.printMatrise();
        } else {
            System.out.println("Multiplisering av matrisene er ikke mulig");
        }

        System.out.println("Transponert matrise: ");
        transponertMatrise.printMatrise();

    }
}
