
import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        final Arvosanatilasto rekisteri = new Arvosanatilasto();

        System.out.println("Syötä yhteispisteet, -1 lopettaa: ");
        while (true) {
            final int input = Integer.parseInt(lukija.nextLine());
            if (input == -1) {
                break;
            }

            if (input < 0 || input > 100) {
                continue;
            }
            rekisteri.lisaaArvosanaPisteet(input);
        }

        rekisteri.haePisteetKeskimaara();
        rekisteri.tulostusSyöttöpisteidenkeskiarvo();
        rekisteri.tulostusArvo();
    }
}
