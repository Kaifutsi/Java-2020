
import java.util.ArrayList;
import java.util.Scanner;

import javax.sql.rowset.spi.SyncResolver;

public class LoytyykoListalta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        ArrayList<String> lista = new ArrayList<>();
        while (true) {
            String luettu = lukija.nextLine();
            if (luettu.equals("")) {
                break;
            }

            lista.add(luettu);
        }

        System.out.println("Ketä etsitään? "); 
        String name = lukija.nextLine();

        boolean ja = lista.contains(name);
        if (ja) {
            System.out.println(name + " löytyi!");
        }
        else {
            System.out.println(name + " ei löytynyt!");
        }

    }
}
