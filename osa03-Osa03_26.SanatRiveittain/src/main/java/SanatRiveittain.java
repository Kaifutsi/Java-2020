
import java.util.Scanner;

public class SanatRiveittain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String sanat = scanner.nextLine();

            if (sanat.equals("")) {
                break;
            }

            String[] palat = sanat.split(" ");
            
            for (int i = 0; i < palat.length; i++) {
                System.out.println(palat[i]);

            }
        }


    }
}


