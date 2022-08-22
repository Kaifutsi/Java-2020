
import java.util.Scanner;

public class TietytSanatRiveittain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String sanat = scanner.nextLine();

            if (sanat.equals("")) {
                break;
            }

            String[] palat = sanat.split(" ");
            
            for (String pala: palat) {
                if (pala.contains("av")) { 
                    System.out.println(pala);
                }
               
            }
        
        }


    }
}
