package org.example;

public class Fraction {
    private double numerator, denominator;
    private String resOutput;

    public Fraction(double numerator, double denominator) {
        if (denominator == 0) throw new IllegalArgumentException("The dominator can not be zero");

        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction(double numerator) {
        this(numerator, 1);
    }

    public void multiply(Fraction b) {
        double resNumerator = this.numerator * b.numerator;
        double resDenominator = this.denominator * b.denominator;
        this.resOutput = String.format("%f / %f", resNumerator, resDenominator);
    }

    public void divide(Fraction b) {
        double resNumerator = this.numerator * b.denominator;
        double resDenominator = this.denominator * b.numerator;
        this.resOutput = String.format("%f / %f", resNumerator, resDenominator);
    }

    public void add(Fraction b) {
        double resNumerator = (this.numerator * b.denominator) + (b.numerator * this.denominator);
        double resDenominator = this.denominator * b.denominator;
        this.resOutput = String.format("%f / %f", resNumerator, resDenominator);
    }

    public void subtract(Fraction b) {
        double resNumerator = (this.numerator * b.denominator) - (b.numerator * this.denominator);
        double resDenominator = this.denominator * b.denominator;
        this.resOutput = String.format("%f / %f", resNumerator, resDenominator);
    }

    public String getResOutput() {
        return resOutput;
    }

    public static void main(String[] args) {

        Fraction a, b;
        try {
            a = new Fraction(6.9, 3.2);
        } catch(IllegalArgumentException e) {
            System.out.println(e);
            a = new Fraction(1);
        }
        try {
            b = new Fraction(4.1, 2);
        } catch(IllegalArgumentException e)   {
            System.out.println(e);
            b = new Fraction(1);
        }

        a.multiply(b);
        System.out.println(a.getResOutput());
        a.divide(b);
        System.out.println(a.getResOutput());
        a.add(b);
        System.out.println(a.getResOutput());
        a.subtract(b);
        System.out.println(a.getResOutput());

    }
}
