
public class Tulostelua {

    public static void main(String[] args) {
        tulostaTahtia(4);
     //   System.out.println();  // tulostetaan kuvioiden välille ---
        tulostaNelio(4);
    //    System.out.println("");
        tulostaSuorakulmio(5, 6);
    //    System.out.println("\n---");
        tulostaKolmio(3);
    }

    public static void tulostaTahtia(int maara) {                //1.
        int n = 0;
        for(n = 0; n < maara; n++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void tulostaNelio(int sivunpituus) {          //2.
        int n = 0;
        for(n = 0; n < sivunpituus; n++) {
            for(int i = 0; i < sivunpituus; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void tulostaSuorakulmio(int leveys, int korkeus) {
        for(int n = 0; n < korkeus; n++) {
            for(int i = 0; i < leveys; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void tulostaKolmio(int koko) {
        int n = 0;
        for(n = 0; n <= koko; n++) {
            for(int i = n; i > 0; i--) {
                System.out.print("*");
           
            }
            System.out.println("");
        }
        
    }
}
