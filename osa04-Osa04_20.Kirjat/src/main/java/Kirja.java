public class Kirja {

    private String nimi;
    private int pituus;
    private int julvu;

    public Kirja(String nimi, int pituus, int julvu) {
        this.nimi = nimi;
        this.pituus = pituus;
        this.julvu = julvu;
    }

    public String getNimi() {
        return nimi;
    }

    @Override
    public String toString() {
        return this.nimi + ", " + this.pituus + " sivua, " + this.julvu;
    }

}
