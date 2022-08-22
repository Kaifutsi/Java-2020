
public class Laskuri {

    private int alkuarvo;

    public Laskuri() {
    }

    public Laskuri(int alkuarvo) {
        this.alkuarvo = alkuarvo;
    }

    public int arvo() {
        return alkuarvo;

    }

    public void lisaa() {
        this.alkuarvo = this.alkuarvo + 1;

    }

    public void lisaa(int lisaa) {
        if (lisaa >= 0) {
            this.alkuarvo = this.alkuarvo + lisaa;
        }
        
    }

    public void vahenna(int vahen) {
        if (vahen >= 0) {
            this.alkuarvo = this.alkuarvo - vahen;
        }
        
    }

    public void vahenna() {
        this.alkuarvo = this.alkuarvo - 1;
        
    }

}
