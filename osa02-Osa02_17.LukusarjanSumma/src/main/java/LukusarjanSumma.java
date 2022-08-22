
import java.util.Scanner;

public class LukusarjanSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int tulos = 0;
        System.out.println("Mihin asti?");
        int luku = Integer.valueOf(lukija.nextLine());
        for (int i = 1; i <= luku; i++) {
            tulos = tulos + i;
            
        }
        System.out.println("Summa on " + tulos);
    }
}
