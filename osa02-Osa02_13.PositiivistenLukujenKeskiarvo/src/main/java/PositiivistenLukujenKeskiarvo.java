
import java.util.Scanner;

public class PositiivistenLukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        double yht = 0;
        double yh = 0;
        while (true) {
            System.out.println("Syötä luku");
            int luku = Integer.valueOf(lukija.nextLine());
        
            if (luku == 0) {
                break;
            }
            
            if (luku > 0) {
                yh = yh + 1;
            }

            if (luku > 0) {
                yht = yht + luku;
            }


        }
        System.out.println(yht / yh);
        
        if (yh == 0 && yht == 0) {
            System.out.println("keskiarvon laskeminen ei ole mahdollista");
        }
    }
}
