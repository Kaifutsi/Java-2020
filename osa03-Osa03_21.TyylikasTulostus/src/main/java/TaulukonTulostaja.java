
public class TaulukonTulostaja {

    public static void main(String[] args) {
        // Tässä voit testata metodia
        int[] taulukko = {5, 1, 3, 4, 2};
        tulostaTyylikkaasti(taulukko);
    }

    public static void tulostaTyylikkaasti(int[] taulukko) {
        int luku = 0;
        int indeksi = 0;
        while (indeksi < taulukko.length - 1) {
            luku = taulukko[indeksi];
            System.out.print(luku + ", ");
            indeksi = indeksi + 1;
        }

        for (int i = indeksi; i < taulukko.length; i++) {
            int luk = taulukko[indeksi];
            System.out.print(luk);
        }
    }
}
