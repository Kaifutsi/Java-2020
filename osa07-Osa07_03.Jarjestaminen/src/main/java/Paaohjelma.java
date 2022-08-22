import java.util.Arrays;

public class Paaohjelma {

    public static void main(String[] args) {
        
        int[] luvut = {8, 3, 7, 9, 1, 2, 4};
        Paaohjelma.jarjesta(luvut);
    }


    public static int pienin(int[] taulukko) {
        int pienin = taulukko[0];

        for (int i = 0; i < taulukko.length; i++) {
            if (taulukko[i] < pienin) {
                pienin = taulukko[i];
            }
        }
        return pienin;
    }

    public static int pienimmanIndeksi(int[] taulukko) {
        int pienin = taulukko[0];
        int indeksi = 0;

        for (int i = 0; i < taulukko.length; i++) {
            if (taulukko[i] < pienin) {
                pienin = taulukko[i];

                indeksi = i;
            }
        }

        return indeksi;
    }

    public static int pienimmanIndeksiAlkaen(int[] taulukko, int aloitusIndeksi) {
        int indeksi = aloitusIndeksi;
        int pienin = taulukko[indeksi];

        for (int i = aloitusIndeksi; i < taulukko.length; i++) {
            if (taulukko[i] < pienin) {
                pienin = taulukko[i];
                indeksi = i;
            }
        }

        return indeksi;
    }

    public static void vaihda(int[] taulukko, int indeksi1, int indeksi2) {
        int t = taulukko[indeksi1];
        taulukko[indeksi1] = taulukko[indeksi2];
        taulukko[indeksi2] = t;
    }

    public static void jarjesta(int[] taulukko) {
        int indeksi = 0;
        System.out.println(Arrays.toString(taulukko));

        while (indeksi < taulukko.length) {

            vaihda(taulukko, indeksi, pienimmanIndeksiAlkaen(taulukko, indeksi));
            System.out.println(Arrays.toString(taulukko));

            indeksi += 1;
        }

    }



}
