
import java.util.Scanner;

public class ViimeisetSanat {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        while (true) {
            String sanat = lukija.nextLine();
            
            if (sanat.equals("")) {
                break;
            }

            String[] palat = sanat.split(" ");
        
            System.out.println(palat[palat.length-1]);
            
        }  
        
    }
}
