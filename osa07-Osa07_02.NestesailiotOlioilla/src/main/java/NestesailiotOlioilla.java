
import java.util.Scanner;

public class NestesailiotOlioilla {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        Sailio ensimSailio = new Sailio();
        Sailio toinenSailio = new Sailio();

        while (true) {
            System.out.println("Ensimmäinen: " + ensimSailio);
            System.out.println("Toinen: " + toinenSailio);

            String luettu = lukija.nextLine();
            String[] osat = luettu.split(" ");


            if (osat[0].equals("lopeta")) {
                break;
            } else if (osat[0].equals("lisaa")) {
                int maara = Integer.parseInt(osat[1]);
                ensimSailio.lisaa(maara);
                
            } else if (osat[0].equals("siirra")) {
                int maara = Integer.parseInt(osat[1]);
                if (maara > ensimSailio.sisalto()) {
                    toinenSailio.lisaa(ensimSailio.sisalto());
                } else {
                    ensimSailio.poista(maara); 
                    toinenSailio.lisaa(maara); 
                }

            } else if (osat[0].equals("poista")) {
                int maara = Integer.parseInt(osat[1]);
                toinenSailio.poista(maara);
            }

        }

        
    }

}
