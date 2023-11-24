public class Valuta {
    public String navn;
    public double kurs;
    public Valuta(String navn, double kurs) {
        this.navn = navn;
        this.kurs = kurs;
    }

    public String getNavn() {
        return navn;
    }

    public double getKurs() {
        return kurs;
    }

    public double tilNok(double belop) {
        return belop * kurs;
    }

    public double fraNok(double belop) {
        return belop / kurs;
    }
}
