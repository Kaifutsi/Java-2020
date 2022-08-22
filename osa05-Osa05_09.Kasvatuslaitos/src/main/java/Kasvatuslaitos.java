
public class Kasvatuslaitos {

    private int maara;

    public Kasvatuslaitos() {
        maara = 0;
    }


    public int punnitse(Henkilo henkilo) {
        maara++;
        return henkilo.getPaino();
    }

    public void syota(Henkilo henkilo) {
        henkilo.setPaino(henkilo.getPaino() + 1);
    }

    public int punnitukset() {
        return maara;
    }

}
