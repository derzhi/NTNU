package org.example.oppgave2;

public class Main {
    public static void main(String[] args) {
        SentenceProcessor a = new SentenceProcessor("de testet. asdasdasd, adsad dsadsd? asda;");
        System.out.println(a.wordCount());
        System.out.println(a.avgWordLength());
        System.out.println(a.avgWordsPerPeriod());
        a.replaceWord("de", "wow");
        System.out.println(a.getText());
        System.out.println(a.getUpperCaseText());
    }
}
