
public class Tulostin {

    public static void main(String[] args) {
        // Tässä voit testata metodia
        int[] taulukko = {5, 1, 3, 4, 2};
        tulostaTaulukkoTahtina(taulukko);
    }

    public static void tulostaTaulukkoTahtina(int[] taulukko) {
        int luku = 0;
        int indeksi = 0;
        while (indeksi < taulukko.length) {
            luku = taulukko[indeksi];
            indeksi = indeksi + 1;
            for (int i = 0; i < luku; i++) {
                System.out.print("*");

            }
        System.out.println("");     
 
        }
    }

}
