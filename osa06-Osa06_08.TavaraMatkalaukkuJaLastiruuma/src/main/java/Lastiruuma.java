import java.util.ArrayList;

public class Lastiruuma {

    private int maksimiPaino;
    private ArrayList<Matkalaukku> matkalaukut;

    public Lastiruuma(int maksimiPaino) {
        this.maksimiPaino = maksimiPaino;
        this.matkalaukut = new ArrayList<>();
    }

    public void lisaaMatkalaukku(Matkalaukku laukku) {
        int lastiruumaPaino = 0;
        for (Matkalaukku matkaLaukku : matkalaukut) {
            lastiruumaPaino += matkaLaukku.yhteispaino();
        }

        if ((this.maksimiPaino - lastiruumaPaino) >= laukku.yhteispaino()) {
            this.matkalaukut.add(laukku);
        }
    }

    public int lastiruumaSize(){
        return matkalaukut.size();
    }


    public String toString() {
        int yhteisPaino = 0;
        for (Matkalaukku laukku: matkalaukut) {
            yhteisPaino += laukku.yhteispaino();
        }
        return lastiruumaSize() + " matkalaukkua (" + yhteisPaino + " kg)";

    }

    
    public void tulostaTavarat() {
        for (Matkalaukku laukku: matkalaukut){
            laukku.tulostaTavarat();
        }

    }

}
