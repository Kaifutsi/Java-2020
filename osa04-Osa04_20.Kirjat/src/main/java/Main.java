
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Kirja> ohjelmat = new ArrayList<>();
        Scanner lukija = new Scanner(System.in);

        while(true) {

            System.out.print("Nimi: ");
            String nimi = lukija.nextLine();
            if (nimi.isEmpty()) {
                break;
            }

             
            System.out.print("Sivuja: ");
            int sivu = Integer.valueOf(lukija.nextLine( ));

            System.out.print("Julkaisuvuosi: ");
            int julvu = Integer.valueOf(lukija.nextLine( ));

            ohjelmat.add(new Kirja (nimi, sivu, julvu));


        }

        System.out.println("Mitä tulostetaan? ");
        String nimi = lukija.nextLine();


        
        for (Kirja kirja: ohjelmat) {
            if (nimi.equals("kaikki")) {
                System.out.println(kirja);
            }

            if (nimi.equalsIgnoreCase("nimi")) {
                System.out.println(kirja.getNimi());
            }

        }

    }

}