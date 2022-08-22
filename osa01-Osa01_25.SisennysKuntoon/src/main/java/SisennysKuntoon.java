
import java.util.Scanner;

public class SisennysKuntoon {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int luku = Integer.valueOf(lukija.nextLine());
        if (luku != 0) {
            System.out.println("Luku oli erisuuri kuin 0");
        }
    }
}
