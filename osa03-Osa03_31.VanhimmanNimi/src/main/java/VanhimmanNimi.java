
import java.util.Scanner;

public class VanhimmanNimi {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int max = 0;
        int ika = 0;
        int i = 0;
        String nimi = "a";
        String nimimax = "b";
        


        while (true) {
            String luettu = lukija.nextLine();
            if (luettu.equals("")) {
                break;
            }
            
            String[] palat = luettu.split(",");
            ika = Integer.valueOf(palat[1]);
            nimi = palat[0];

            for (i = 0; i < palat.length; i++) {
                if (ika > max) {
                   max = ika;
                   nimimax = nimi;
                }
            }
  
        }
        System.out.println("Vanhimman nimi: " + nimimax);
    }
}
