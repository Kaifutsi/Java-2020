
import java.util.Scanner;

public class Nelilaskin {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // toteuta ohjelma tänne
        System.out.println("Syötä ensimmäinen luku!");
        int x = Integer.valueOf(lukija.nextLine());
        System.out.println("Syötä toinen luku!");
        int y = Integer.valueOf(lukija.nextLine());
        int summa = x + y;
        int min = x - y;
        int kerta = x * y;
        double jaa = (double) x / y;
        System.out.println(x + " + " + y + " = " + summa);
        System.out.println(x + " - " + y + " = " + min);
        System.out.println(x + " * " + y + " = " + kerta);
        System.out.println(x + " / " + y + " = " + jaa);
    }
}
