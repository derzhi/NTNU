package org.example.oppgave1;

public class NyString {
    private final String tekst;

    public NyString(String tekst) {
        this.tekst = tekst;
    }

    public void forkort() {
        StringBuilder result = new StringBuilder();
        String[] arrInput = this.tekst.split(" ");

        for (String a : arrInput) {
            result.append(a.charAt(0));
        }

        System.out.println(result);
    }


    public void fjernTegn(String tegn) {
        StringBuilder result = new StringBuilder();
        String[] arrInput = this.tekst.split(tegn, 0);

        for (String a : arrInput) {
            result.append(a);
        }

        System.out.println(result);
    }

}
