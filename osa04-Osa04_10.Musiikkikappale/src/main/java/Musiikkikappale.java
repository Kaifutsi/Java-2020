public class Musiikkikappale {
    private String nimi;
    private int pituus;

    public Musiikkikappale(String kappaleenNimi, int kappaleenPituus) {
        this.nimi = kappaleenNimi;
        this.pituus = kappaleenPituus;

    }

    public String nimi() {
        System.out.println();
        return nimi;


    }

    public int pituus() {
        return pituus;


    }
    
}
