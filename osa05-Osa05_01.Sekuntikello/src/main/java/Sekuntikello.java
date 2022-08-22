

public class Sekuntikello {
    private Viisari sekunnit;
    private Viisari osa;

    public Sekuntikello() {
        this.sekunnit = new Viisari(60);
        this.osa = new Viisari(100);
    }

    public void etene() {
        this.osa.etene();

        if (this.osa.arvo() == 0) {
            this.sekunnit.etene();

        }
    }

    public String toString() {
        return this.sekunnit + ":" + this.osa;
    }
}
