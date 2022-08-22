
public class Lukutilasto {

    private int tilasto;
    private int summa;


    public Lukutilasto() {
        this.tilasto = 0;
        this.summa = 0;
        
    

    }

    public void lisaaLuku(int luku) {
        this.summa += luku;
        this.tilasto ++;
    }

    public int haeLukujenMaara() {
        return this.tilasto;

    }

    public int summa() {
        return summa;

    }

    public double keskiarvo() {
        if (this.tilasto == 0) {
        return 0.0;
        }

        return 1.0 * this.summa / this.tilasto;
    }
}
