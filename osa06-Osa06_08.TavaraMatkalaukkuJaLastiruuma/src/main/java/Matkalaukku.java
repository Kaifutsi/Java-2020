import java.util.ArrayList;

public class Matkalaukku {
    private ArrayList<Tavara> tavarat;
    private int maksimiPaino;

    public Matkalaukku(int maksimiPaino) {
        this.tavarat = new ArrayList<>();
        this.maksimiPaino = maksimiPaino;
    }

    public void lisaaTavara(Tavara tavara) {
        int matkalaukkuPaino = 0;

        for(Tavara i : tavarat) {
            matkalaukkuPaino += i.getPaino();
        }

        if ((this.maksimiPaino - matkalaukkuPaino) >= tavara.getPaino()) {
            this.tavarat.add(tavara);
        }
    }


    public Tavara raskainTavara() {
        if (this.tavarat.isEmpty()) {
            return null;
        }

        Tavara a = this.tavarat.get(0);
        for (Tavara tavara : tavarat) {
            if (tavara.getPaino() > a.getPaino()) {
                a = tavara;
            }
        }
        return a;
    }


    public void tulostaTavarat() {
        for (Tavara tavara : tavarat) {
            System.out.println(tavara);
        }
    }

    public int size() {
        return tavarat.size();
    }

    public int yhteispaino() {
        int yhteisPaino = 0;
        
        for (Tavara tavara : this.tavarat) {
            yhteisPaino += tavara.getPaino();
        }
        return yhteisPaino;
    }

    @Override
    public String toString() {
        int matkalaukkuPaino = 0;
        
        for (Tavara tavara : tavarat) {
            matkalaukkuPaino += tavara.getPaino();
        }
        
        if (this.tavarat.isEmpty()) {
            return "ei tavaroita (" + matkalaukkuPaino + " kg)";
        }
        
        if (this.tavarat.size() == 1) {
            return this.tavarat.size() + " tavara (" + matkalaukkuPaino + " kg)";
        }
        
        return this.tavarat.size() + " tavaraa (" + matkalaukkuPaino + " kg)";
    }

}
