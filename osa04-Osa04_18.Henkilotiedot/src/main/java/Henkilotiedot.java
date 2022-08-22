
import java.util.ArrayList;
import java.util.Scanner;

public class Henkilotiedot {

    public static void main(String[] args) {
        ArrayList<Henkilotieto> henkilotiedot = new ArrayList<>();
        Scanner lukija = new Scanner(System.in);

        while(true) {

            System.out.print("Etunimi: ");
            String etunimi = lukija.nextLine();
            if (etunimi.isEmpty()) {
                break;
            }

            
            System.out.print("Sukunimi: ");
            String sukunimi = lukija.nextLine( );

            System.out.print("Henkilötunnus: ");
            String henkilots = lukija.nextLine();

            henkilotiedot.add(new Henkilotieto(etunimi, sukunimi, henkilots));


        }
        System.out.println();

        
        for (Henkilotieto henkilotie: henkilotiedot) {
            System.out.println(henkilotie.getEtunimi() + " " + henkilotie.getSukunimi());
        }
    }
}
