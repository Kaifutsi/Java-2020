
import java.util.ArrayList;
import java.util.Scanner;

public class ListanLukujenSumma {

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
        int luku = 0;
        for (int i = 0; i < lista.size(); i++) {
            int luk = lista.get(i);
            if(luk==luk) {
                luku=luku+luk;

            }

        }
        
        System.out.println("Summa: " + luku);


        // toteuta listan lukujen summan laskeminen tänne
    }
}
