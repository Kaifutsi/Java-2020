
import java.util.Scanner;

public class KolmenLuvunKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // toteuta ohjelma tänne
        System.out.println("Syötä ensimmäinen luku!");
        int x = Integer.valueOf(lukija.nextLine());
        System.out.println("Syötä toinen luku!");
        int y = Integer.valueOf(lukija.nextLine());
        System.out.println("Syötä kolmas luku!");
        int z = Integer.valueOf(lukija.nextLine());
        double lasku = (double) (x + y + z) / 3;
        System.out.println("Syötettyjen lukujen keskiarvo on " + lasku);
    }
}
