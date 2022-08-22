
import java.util.ArrayList;
import java.util.Scanner;

public class KysytynLuvunIndeksi {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        while (true) {
            int luettu = Integer.valueOf(lukija.nextLine());
            if (luettu == -1) {
                break;
            }

            lista.add(luettu);
        }

        System.out.println("Mitä etsitään? ");
        int luk = Integer.valueOf(lukija.nextLine());
        for (int indeksi = 0; indeksi < lista.size(); indeksi++) {
            if (luk == lista.get(indeksi)) {
                System.out.println("Luku " + luk + " on indeksissä " + indeksi);    
            }
        }

    }
}
