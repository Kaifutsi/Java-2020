
import java.util.Scanner;

public class SummanNeliojuuri {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int eka = Integer.valueOf(lukija.nextLine());
        int toka = Integer.valueOf(lukija.nextLine());
        int tulo = eka + toka;
        double neliojuuri = Math.sqrt(tulo);
        System.out.println(neliojuuri);

    }
}
