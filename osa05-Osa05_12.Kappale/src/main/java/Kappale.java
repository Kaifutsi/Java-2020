
public class Kappale {

    private String esittaja;
    private String nimi;
    private int pituusSekunteina;

    public Kappale(String esittaja, String nimi, int pituusSekunteina) {
        this.esittaja = esittaja;
        this.nimi = nimi;
        this.pituusSekunteina = pituusSekunteina;
    }

    public String getEsittaja() {
        return this.esittaja;
    }

    public String getNimi() {
        return this.nimi;
    }

    public int getPituusSekunteina() {
        return this.pituusSekunteina;
    }

    public boolean equals(Object verrattava) {

        if (this == verrattava) {
            return true;
        }

        if (!(verrattava instanceof Kappale)) {
            return false;
        }

        Kappale verrattavaKappale = (Kappale) verrattava;

        // jos olioiden oliomuuttujien arvot ovat samat, ovat oliot samat
        if (this.esittaja == verrattavaKappale.esittaja &&
            this.nimi == verrattavaKappale.nimi &&
            this.pituusSekunteina == verrattavaKappale.pituusSekunteina) {
            return true;
        }

        // muulloin oliot eivät ole samat
        return false;
    }

    @Override
    public String toString() {
        return this.esittaja + ": " + this.nimi + " (" + this.pituusSekunteina + " s)";
    }


}
