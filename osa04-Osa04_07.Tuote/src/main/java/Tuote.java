

public class Tuote {
    private double hinta;
    private int lukumäärä;
    private String nimi;
    
    public Tuote(String nimiAlussa, double hintaAlussa, int maaraAlussa) {
        this.lukumäärä = maaraAlussa;
        this.hinta = hintaAlussa;
        this.nimi = nimiAlussa;

    }

    public void tulostaTuote() {
        System.out.println(this.nimi + "hinta" + this.hinta + this.lukumäärä + "kpl");
    }
}
