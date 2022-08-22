
import java.util.Scanner;

public class VanhimmanIka {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int max = 0;

        while (true) {
            String luettu = lukija.nextLine();
            if (luettu.equals("")) {
                break;
            }

            String[] palat = luettu.split(",");
            int ika = Integer.valueOf(palat[1]);
            for (int rok = 0; rok < palat.length; rok++) {
                if (ika > max) {
                    max = ika;
                }
            }
        }
        System.out.println("Vanhimman ikä: " + max);   
    }
}
