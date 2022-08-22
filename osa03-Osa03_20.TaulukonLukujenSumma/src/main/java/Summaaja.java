
public class Summaaja {

    public static void main(String[] args) {
        // Tässä voit testata metodia
        int[] taulukko = {5, 1, 3, 4, 2};
        System.out.println(laskeTaulukonLukujenSumma(taulukko));
    }

    public static int laskeTaulukonLukujenSumma(int[] taulukko) {
        int indeksi = 0;
        int summa = 0;
        while (indeksi < taulukko.length) {
            int luku = taulukko[indeksi];
            indeksi = indeksi + 1;
            summa = summa + luku;
        }

        return summa;
    }
}
