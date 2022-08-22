
import java.util.Scanner;

public class LukujenSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int yht = 0;
        while (true) {
            System.out.println("Syötä luku");
            int luku = Integer.valueOf(lukija.nextLine());
        
            if (luku == 0) {
                break;
            }
            
            if (luku != 0) {
                yht = yht + luku;
        
            }
        }
        System.out.println("Lukujen summa " + yht);
    }
}
