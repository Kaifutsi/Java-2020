
import java.util.Scanner;

public class YhteenlaskuJaKaava {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // toteuta ohjelma tänne
        System.out.println("Syötä ensimmäinen luku!");
        int x = Integer.valueOf(lukija.nextLine());
        System.out.println("Syötä toinen luku!");
        int y = Integer.valueOf(lukija.nextLine());
        int summa = x + y;
        System.out.println(x + " + " + y + " = " + summa);

    }
}
