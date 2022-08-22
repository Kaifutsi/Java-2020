import java.util.Scanner;

public class Kayttoliittyma {

    private Vitsipankki vitsipankki;
    private Scanner scanner;

    public Kayttoliittyma(Vitsipankki vitsipankki, Scanner scanner) {
        this.vitsipankki = vitsipankki;
        this.scanner = scanner;
    }

    public void kaynnista() {
        while (true) {
            System.out.println("Komennot:");
            System.out.println(" 1 - lisää vitsi");
            System.out.println(" 2 - arvo vitsi");
            System.out.println(" 3 - listaa vitsit");
            System.out.println(" X - lopeta");

            String kommento = scanner.nextLine();
            if(kommento.equals("X")) {
                break;
            }

            if(kommento.equals("1")) {
                System.out.println("Kirjoita lisättävä vitsi:");
                String vitsi = scanner.nextLine();
                vitsipankki.lisaaVitsi(vitsi);
            } else if(kommento.equals("2")) {
                String arpo = vitsipankki.arvoVitsi();
                System.out.println(arpo);
            } else if(kommento.equals("3")) {
                System.out.println("Tulostetaan vitsit.");
                vitsipankki.tulostaVitsit();
            }
        }
    }
    
}
