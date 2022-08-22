
import java.util.Scanner;

public class Kertoma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Anna luku: ");
        int n = Integer.valueOf(lukija.nextLine());
        int x = 1;
        for (int i = 1; i <= n; i++ ) {
            x = x * i;
        }
        System.out.println("Kertoma on " + x);
    }
}
