package org.example.oppgave3;

import java.util.Arrays;

public class Matrise {
    private final double[][] m;
    private final int rader;
    private final int kolonner;

    public Matrise(double[][] n) {
        m = n;
        this.rader = n.length;
        this.kolonner = n[0].length;
    }

    public Matrise adderMatrise(Matrise andreMatrise) {
        if (this.rader == andreMatrise.rader && this.kolonner == andreMatrise.kolonner) {
            double[][] resultat =  new double[this.rader][this.kolonner];
            for (int i = 0; i < this.rader; i++) {
                for (int j = 0; j < this.kolonner; j++) {
                    resultat[i][j] = this.m[i][j] + andreMatrise.m[i][j];
                }
            }
            return new Matrise(resultat);
        } else {
            return null;
        }
    }

    public Matrise multipliserMatrise(Matrise andreMatrise) {
        if (this.kolonner == andreMatrise.rader) {
            double[][] resultat = new double[this.rader][andreMatrise.kolonner];
            for (int i = 0; i < this.rader; i++) {
                for (int j = 0; j < andreMatrise.kolonner; j++) {
                    double sum = 0;
                    for (int k = 0; k < this.kolonner; k++) {
                        sum += this.m[i][k] * andreMatrise.m[k][j];
                    }
                    resultat[i][j] = sum;
                }
            }
            return new Matrise(resultat);
        } else {
            return null;
        }
    }

    public Matrise transponerMatrise() {
        double[][] resultat = new double[this.kolonner][this.rader];

        for (int i = 0; i < this.kolonner; i++) {
            for (int j = 0; j < this.rader; j++) {
                resultat[i][j] = this.m[j][i];
            }
        }

        return new Matrise(resultat);
    }

    public void printMatrise() {
        for (int i = 0; i < rader; i++) {
            System.out.println(Arrays.toString(m[i]));
        }
    }
}
