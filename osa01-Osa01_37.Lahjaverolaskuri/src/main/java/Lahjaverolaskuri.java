
import java.util.Scanner;

public class Lahjaverolaskuri {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Lahjan suuruus? ");
        int luku = Integer.valueOf(lukija.nextLine());
        if (luku < 5000) {
            System.out.println("Ei veroa!");
        } else if (luku >= 5000 && luku < 25000) {
            System.out.println(100 + (luku - 5000) * 0.08);
        } else if (luku >= 25000 && luku < 55000) {
            System.out.println(1700 + (luku - 25000) * 0.10);
        } else if (luku >= 55000 && luku < 200000) {
            System.out.println(4700 + (luku - 55000) * 0.12);
        } else if (luku >= 200000 && luku < 1000000) {
            System.out.println(22100 + (luku - 200000) * 0.15);
        } else if (luku >= 1000000) {
            System.out.println(142100 + (luku - 1000000) * 0.17);
        }

    }
}
