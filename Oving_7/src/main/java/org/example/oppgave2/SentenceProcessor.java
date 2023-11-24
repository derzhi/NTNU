package org.example.oppgave2;

public class SentenceProcessor {
    private String text;
    private final static String DELIMITERS = "[ .!:?]";

    public SentenceProcessor(String text) {
        this.text = text;
    }

    public int wordCount() {
        return this.text.length();
    }

    public double avgWordLength() {
        String[] words = this.text.split(DELIMITERS, 0);
        double wordsAmount = words.length;
        double totalCharacters = 0;

        for (String a : words) {
            totalCharacters += a.length();
            System.out.println(a);
        }

        return totalCharacters/wordsAmount;
    }

    public double avgWordsPerPeriod() {
        String[] periods = this.text.split(DELIMITERS.replace(" ", ""), 0);
        String[] words = this.text.split(DELIMITERS, 0);
        double periodsLength = periods.length;
        double wordsLength = words.length;

        return wordsLength/periodsLength;
    }

    public void replaceWord(String select, String replace) {
        this.text = this.text.replaceAll(select, replace);
    }


    public String getText() {
        return this.text;
    }

    public String getUpperCaseText() {
        return this.text.toUpperCase();
    }

}
