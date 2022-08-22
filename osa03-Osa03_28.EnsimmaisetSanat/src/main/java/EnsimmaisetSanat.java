
import java.util.Scanner;

public class EnsimmaisetSanat {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        while (true) {
            String sanat = lukija.nextLine();

            if (sanat.equals("")) {
                break;
            }

            String[] palat = sanat.split(" ");
            
            for (int i = 0; i < palat.length; i++) {
            }
            System.out.println(palat[0]);
        }       
            
    }
}
