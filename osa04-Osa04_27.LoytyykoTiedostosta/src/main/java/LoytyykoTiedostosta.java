import java.nio.file.Paths;
import java.util.Scanner;


public class LoytyykoTiedostosta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean yes = false;
        System.out.println("Minkä niminen tiedosto luetaan? ");
        String tiedosto = scanner.nextLine();

        System.out.println("Mitä etsitään?");
        String etsittava = scanner.nextLine();

        try {
            scanner = new Scanner(Paths.get(tiedosto));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.contains(etsittava)) {
                    yes = true;
                }
            }
            
            if (yes) {
                System.out.println("Löytyi!");
            } else {
                System.out.println("Ei löytynyt.");
            }
        } catch (Exception e) {
            System.out.println("Tiedoston " + tiedosto + " lukeminen epäonnistui.");
        }


    }
}
