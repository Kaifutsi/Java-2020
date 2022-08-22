
import java.util.Scanner;

public class Kayttajatunnukset {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Anna tunnus: ");
        String tunnus = lukija.nextLine();
        System.out.println("Anna salasana: ");
        String salasana = lukija.nextLine();

        if ((tunnus.equals("aleksi"))) {
            if ((salasana.equals("tappara"))) {
                System.out.println("Olet kirjautunut järjestelmään");
            } 
        } 
        
        if ((tunnus.equals("elina"))) {
            if ((salasana.equals("kissa"))) {
                System.out.println("Olet kirjautunut järjestelmään");
            } 
        }

        if (!(tunnus.equals("aleksi") )) {
            if (!(salasana.equals("tappara"))) {
            } 
            if (!(tunnus.equals("elina"))) {
                if (!(salasana.equals("kissa"))) {
                }
                System.out.println("Virheellinen tunnus tai salasana!"); 
            }
      
        }

        if ((tunnus.equals("aleksi") )) {
            if (!(salasana.equals("tappara"))) { 
                System.out.println("Virheellinen tunnus tai salasana!"); 
            }
      
        }

        if (!(tunnus.equals("aleksi") )) {
            if ((salasana.equals("tappara"))) { 
                System.out.println("Virheellinen tunnus tai salasana!"); 
            }
      
        }

        if ((tunnus.equals("elina") )) {
            if (!(salasana.equals("kissa"))) { 
                System.out.println("Virheellinen tunnus tai salasana!"); 
            }
      
        }

        if (!(tunnus.equals("elina") )) {
            if ((salasana.equals("kissa"))) { 
                System.out.println("Virheellinen tunnus tai salasana!"); 
            }
      
        }

        if ((tunnus.equals("") )) {
        } else if ((salasana.equals("") )) {
            System.out.println("Virheellinen tunnus tai salasana!"); 
        }
    }
}
