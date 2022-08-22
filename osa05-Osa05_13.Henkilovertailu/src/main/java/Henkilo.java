
import java.util.Objects;

public class Henkilo {

    private String nimi;
    private Paivays syntymaPaiva;
    private int pituus;
    private int paino;

    public Henkilo(String nimi, Paivays syntymaPaiva, int pituus, int paino) {
        this.nimi = nimi;
        this.syntymaPaiva = syntymaPaiva;
        this.pituus = pituus;
        this.paino = paino;
    }
    
    public boolean equals(Object verrattava) {
        Henkilo henkilo = (Henkilo)verrattava;
        return this.nimi.equals(henkilo.nimi)
        && this.syntymaPaiva.equals(henkilo.syntymaPaiva)
        && this.pituus == henkilo.pituus
        && this.paino == henkilo.paino;        
        
    }
}
