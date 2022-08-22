
import java.util.ArrayList;
import java.util.Scanner;

public class HenkilotietojenTarkastelu {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int lukumaara = 0;
        int pituus = 0;
        int nimimax = 0;
        String nimimi = "c";
        int summa = 0;
        
        while (true) {
            String luettu = lukija.nextLine();
            if (luettu.equals("")) {
                break;
            }
        
            String[] palat = luettu.split(",");
            String nimi = palat[0];
            pituus = nimi.length();
            

            if (pituus > nimimax) {
                nimimax = pituus;
                nimimi = nimi;
            }


            summa = summa + Integer.valueOf(palat[1]);
            lukumaara ++;
        }
        System.out.println("Pisin nimi: " + nimimi);
        System.out.println("Syntymävuosien keskiarvo: " + (1.0 * summa / lukumaara));

    }
}
