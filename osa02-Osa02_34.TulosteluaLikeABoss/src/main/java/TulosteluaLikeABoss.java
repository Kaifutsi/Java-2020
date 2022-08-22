
public class TulosteluaLikeABoss {

    public static void tulostaTahtia(int maara) {
        int n = 0;
        for(n = 0; n < maara; n++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void tulostaTyhjaa(int maara) {
        for(int n = 0; n < maara; n++) {
            System.out.print(" ");
        }

    }

    public static void tulostaKolmio(int koko) {
        for(int n = 1; n <= koko; n++) {
            for(int s = 0; s < koko-n; s++) {
                System.out.print(" ");
            }
            for(int s = n; s > 0; s--) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void jouluKuusi(int korkeus) {
        for(int n = 1; n <= korkeus; n++) {
            for(int s = 0; s < korkeus-n; s++) {
                System.out.print(" ");
            }
            for(int s = n; s > 1; s--) {
                System.out.print("*");
            }
            for(int z = n; z > 0; z--) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int a = 1; a < 3; a++) {
            for(int b = 1; b <= korkeus-2; b++) {
                System.out.print(" ");
            }
            for(int c = 1; c <= 3; c++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }


    public static void main(String[] args) {
        // Testit eivät katso main-metodia, voit muutella tätä vapaasti.

        tulostaKolmio(3);
        jouluKuusi(4);
        jouluKuusi(10);
    }
}
