import java.text.MessageFormat;
import java.util.List;

public class Resepti {

    private String nimi;
    private int keittoaika;
    private List<String> raakaaineet;

    public Resepti(String nimi, int keittoaika, List<String> raakaaineet) {
        this.nimi = nimi;
        this.keittoaika = keittoaika;
        this.raakaaineet = raakaaineet;
    }

    public String getNimi() {
        return nimi;
    }

    public Resepti setNimi(String nimi) {
        this.nimi = nimi;
        return this;
    }

    public int getKeittoaika() {
        return keittoaika;
    }

    public Resepti setKeittoaika(int keittoaika) {
        this.keittoaika = keittoaika;
        return this;
    }

    public List<String> getRaakaaineet() {
        return raakaaineet;
    }

    public Resepti setRaakaaineet(List<String> raakaaineet) {
        this.raakaaineet = raakaaineet;
        return this;
    }

    @Override
    public String toString() {
        return MessageFormat.format("{0}, keittoaika: {1}", nimi, keittoaika);
    }
}
