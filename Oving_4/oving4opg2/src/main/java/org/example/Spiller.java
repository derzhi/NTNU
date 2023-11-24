package org.example;

import java.util.Random;

public class Spiller {
    public int sumPoeng;
    private static Random terning = new Random();

    public Spiller(int poeng) {
        sumPoeng = poeng;
    }

    public int getSumPoeng() {
        return sumPoeng;
    }

    public void kastTerning() {
        int nySum;

        int n = terning.nextInt(6) + 1;
        System.out.println(n);

        if (n == 1) {
            sumPoeng = 0;
        } else {
            sumPoeng += n;
        }
    }

    public boolean erFerdig() {
        return sumPoeng > 99;
    }




}