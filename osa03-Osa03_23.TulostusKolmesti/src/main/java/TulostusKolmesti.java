
import java.util.Scanner;

public class TulostusKolmesti {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.print("Mikä tulostetaan? ");
        // Luetaan käyttäjältä rivi tekstiä ja asetetaan se muuttujaan nimi
        String jotain = lukija.nextLine();
        String kolmesti = jotain + jotain + jotain;
        
        System.out.println(kolmesti);

    }
}
