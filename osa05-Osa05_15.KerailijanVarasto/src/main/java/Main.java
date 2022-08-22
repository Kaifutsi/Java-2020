
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Asia> asiaList = new ArrayList<>();
        Asia asia;
        while (true) {
            System.out.println("Syötä esineen tunnus, tyhjä lopettaa.");
            String tunnus = scanner.nextLine();
            if(tunnus.isEmpty()) {
                break;
            }

            System.out.println("Syötä esineen nimi, tyhjä lopettaa.");
            String nimi = scanner.nextLine();
            if(nimi.isEmpty()) {
                break;
            }

            asia = new Asia(tunnus, nimi);
            if (!asiaList.contains(asia)) {
                asiaList.add(asia);

            }
        }
        System.out.println("==Esineet==");
        for (Asia asiat : asiaList) {
            System.out.println(asiat);
        }
    }
}
