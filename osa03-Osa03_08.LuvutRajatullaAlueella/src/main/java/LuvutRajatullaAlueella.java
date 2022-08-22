
import java.util.ArrayList;
import java.util.Scanner;

public class LuvutRajatullaAlueella {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        ArrayList<Integer> luvut = new ArrayList<>();
        while (true) {
            int luku = Integer.valueOf(lukija.nextLine());
            if (luku == -1) {
                break;
            }

            luvut.add(luku);
            
        }

        System.out.println("Mistä? ");
        int eka = Integer.valueOf(lukija.nextLine());
        System.out.println("Mihin? ");
        int toka = Integer.valueOf(lukija.nextLine());

        int indeksi = 0;
        
        luvut.add(eka);
        while (indeksi < luvut.size()) {
            indeksi = indeksi + 1;
        }

        luvut.add(toka);
        while (indeksi < luvut.size()) {
            indeksi = indeksi + 1;
        }

        System.out.println(luvut.get(eka));
        System.out.println(luvut.get(toka));
    }
}
