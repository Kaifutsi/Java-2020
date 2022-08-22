
public class EnsimmainenTilisi {

    public static void main(String[] args) {
     //   Tili artonTili = new Tili("Arton tili", 100.00);
        Tili artonSveitsilainenTili = new Tili("Arton tili Sveitsissä", 100.00);

        System.out.println("Alkutilanne");
    //    System.out.println(artonTili);
        System.out.println(artonSveitsilainenTili);

    //    artonTili.otto(20);
    //    System.out.println("Arton tilin saldo on nyt: " + artonTili.saldo());
        artonSveitsilainenTili.pano(20);
    //    System.out.println("Arton toisen tilin saldo on nyt: " + artonSveitsilainenTili.saldo());

        System.out.println("Lopputilanne");
    //    System.out.println(artonTili);
        System.out.println(artonSveitsilainenTili);
    }
}
