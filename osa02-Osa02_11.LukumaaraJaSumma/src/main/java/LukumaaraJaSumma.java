
import java.util.Scanner;

public class LukumaaraJaSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int yht = 0;
        int yh = 0;
        while (true) {
            System.out.println("Syötä luku");
            int luku = Integer.valueOf(lukija.nextLine());
        
            if (luku == 0) {
                break;
            }
            
            if (luku != 0) {
                yh = yh + 1;
            }

            if (luku != 0) {
                yht = yht + luku;
            }
        }
        System.out.println("Lukuja yhteensä " + yh);
        System.out.println("Lukujen summa " + yht);
    }
}
