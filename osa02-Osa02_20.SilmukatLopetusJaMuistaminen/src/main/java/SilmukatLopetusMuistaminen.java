
import java.util.Scanner;

public class SilmukatLopetusMuistaminen {

    public static void main(String[] args) {
        // Kyseessä on yksi iso tehtävä jota koko ajan laajennetaan -- tehtävä
        // on viiden yksittäisen tehtäväpisteen arvoinen

        // Voit halutessasi lähettää osittain tehdyn tehtäväsarjan tarkastettavaksi palvelimelle
        // palvelin valittaa tällöin niistä testeistä joita vastaava koodi ei ole vielä
        // kirjoitettu. Jo tehdyt osat kuitenkin kirjautuvat tehdyiksi.
        Scanner lukija = new Scanner(System.in);
        System.out.print("Syötä luvut: ");

        int summa = 0;
        int l = 0;
        double k = 0;
        int pl = 0;
        int pt = 0;
        
        while (true) {
            int luettu = Integer.valueOf(lukija.nextLine());
        
            if (luettu == -1) {
                break;
            }

            if (luettu > 0) {
                l++;
            }
        
            summa +=  luettu;

            k = summa / (double) l;

                
            if (luettu % 2 == 0 ) {
                pl++;
                continue;
            }

            if (luettu % 2 != 0 ) {
                pt++;
                continue;
            }
        }
        
        System.out.println("Kiitos ja näkemiin!");
        System.out.println("Summa: " + summa);
        System.out.println("Lukuja: " + l);     
        System.out.println("Keskiarvo: " + k);
        System.out.println("Parillisia: " + pl);    
        System.out.println("Parittomia: " + pt);   
    }
}
