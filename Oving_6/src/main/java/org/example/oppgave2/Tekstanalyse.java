package org.example.oppgave2;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class Tekstanalyse {
    int[] antallTegn;
    public Tekstanalyse(String tekst) {
        antallTegn = new int[30];

        String innTekst = tekst.toLowerCase();

        for (int i = 0; i < tekst.length(); i++) {
            int ch = innTekst.charAt(i);
            if (ch > 96 && ch < 123) {
                //bokstaver fra A-Z
                int index = ch - 97;
                antallTegn[index] += 1;
            } else if (ch == 230) {
                //bokstaven Æ
                antallTegn[26] += 1;
            } else if (ch == 248) {
                //bokstaven Ø
                antallTegn[27] += 1;
            } else if (ch == 229) {
                //bokstaven Å
                antallTegn[28] += 1;
            } else {
                //andre tegn
                antallTegn[29] += 1;
            }
        }

        System.out.println(Arrays.toString(antallTegn));
    }

    public void forskjelligeBokstaver() {
        int antall = 0;
        for (int i = 0; i < this.antallTegn.length - 1; i++) {
            if(this.antallTegn[i] > 0) antall += 1;
        }
        System.out.println("Antallet forksjellige bokstaver: " + antall);
    }

    public void totalBokstaver() {
        int antall = 0;
        for (int i = 0; i < this.antallTegn.length - 1; i++) {
            antall += this.antallTegn[i];
        }
        System.out.println("Totalt antall bokstaver: " + antall);
    }

    public void prosentIkkeBokstaver() {
        double antallTegn = this.antallTegn[this.antallTegn.length - 1];
        double antallBokstaver = 0;

        for (int i = 0; i < this.antallTegn.length - 1; i++) {
            antallBokstaver += this.antallTegn[i];
        }

        double prosentTegn = (antallTegn / (antallTegn + antallBokstaver)) * 100;

        System.out.printf("Prosent som ikke er bokstaver: %,.1f \n", prosentTegn);
    }

    public void antallForekomster(char ch) {
        ch = Character.toLowerCase(ch);

        int index;
        if (ch > 96 && ch < 123) {
            //bokstaver fra A-Z
            index = ch - 97;
        } else if (ch == 230) {
            //bokstaven Æ
            index = 26;
        } else if (ch == 248) {
            //bokstaven Ø
            index = 27;
        } else if (ch == 229) {
            //bokstaven Å
            index = 28;
        } else {
            //andre tegn
            index = 29;
        }

        int antallCh = this.antallTegn[index];

        System.out.println("Antall forekomster av " + ch + ": " + antallCh);
    }

    public void flestForekomster() {
        int storstAntall = 0;
        ArrayList<Integer> bokstaverInteger = new ArrayList<Integer>();
        StringBuilder result = new StringBuilder();
        result.append("Det var flest forekomster av: ");

        for(int i = 0; i < this.antallTegn.length - 1; i++) {
            if(this.antallTegn[i] > storstAntall) {
                storstAntall = this.antallTegn[i];
                bokstaverInteger.clear();
                bokstaverInteger.add(i);
            } else if(this.antallTegn[i] == storstAntall) {
                bokstaverInteger.add(i);
            }
        }

        for(int i = 0; i < bokstaverInteger.toArray().length; i++) {
            int index = bokstaverInteger.get(i);
            char ch = 0;

            if(index <  26) {
                ch = (char)(bokstaverInteger.get(i) + 97);
            } else if(index == 26) {
                ch = 230;
            } else if(index == 27) {
                ch = 248;
            } else if(index == 28) {
                ch = 229;
            }

            result.append(ch);
            result.append(" ");
        }

        System.out.println(result);
    }
}
