
import java.util.Scanner;

public class Uudestaan {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        while (true) {
            System.out.println("Syötä luku");
            int komento = Integer.valueOf(lukija.nextLine());
            if (komento == 4) {
                break;
            }
        }
    }
}
