
import java.util.Scanner;

public class Kuutiot {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        while (true) {
            String rivi = lukija.nextLine();
        
            if (rivi.equals("loppu")) {
                break;
            }
            int luku = Integer.valueOf(rivi);
            int luk = 0;
            luk = luku * luku * luku;
            System.out.println(luk);

           
            
        }
    }
}