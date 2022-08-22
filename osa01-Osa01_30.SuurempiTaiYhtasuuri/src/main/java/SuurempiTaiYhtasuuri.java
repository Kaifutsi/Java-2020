
import java.util.Scanner;

public class SuurempiTaiYhtasuuri {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Anna ensimmäinen luku: ");
        int x = Integer.valueOf(lukija.nextLine());
        System.out.println("Anna toinen luku: ");
        int y = Integer.valueOf(lukija.nextLine());
        if (x > y) {
            System.out.println("Suurempi luku: " + x);
        } else if (x < y) {
            System.out.println("Suurempi luku: " + y);
        } else if (x == y) {
            System.out.println("Luvut ovat yhtä suuret!");
        }
    }
}
