
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
        // Alla on ohjelma tehtävässä toteuttamiesi hakualgoritmien testaamiseen.
        Scanner lukija = new Scanner(System.in);
        ArrayList<Kirja> kirjat = new ArrayList<>();
        System.out.println("Kuinka monta kirjaa luodaan?");
        int kirjoja = Integer.valueOf(lukija.nextLine());
        for (int i = 0; i < kirjoja; i++) {
            kirjat.add(new Kirja(i, "nimi kirjalle " + i));
        }

        System.out.println("Millä tunnuksella haetaan kirjaa?");
        int haettava = Integer.valueOf(lukija.nextLine());

        System.out.println("");
        System.out.println("Haetaan peräkkäishaulla:");
        long alku = System.currentTimeMillis();
        int perakkaishakuId = perakkaishaku(kirjat, haettava);
        System.out.println("Haku kesti " + (System.currentTimeMillis() - alku) + " millisekuntia.");
        if (perakkaishakuId < 0) {
            System.out.println("Ei löytynyt.");
        } else {
            System.out.println("Löytyi! " + kirjat.get(perakkaishakuId));
        }

        System.out.println("");

        System.out.println("");
        System.out.println("Haetaan binäärihaulla:");
        alku = System.currentTimeMillis();
        int binaarihakuId = perakkaishaku(kirjat, haettava);
        System.out.println("Haku kesti " + (System.currentTimeMillis() - alku) + " millisekuntia.");
        if (binaarihakuId < 0) {
            System.out.println("Ei löytynyt.");
        } else {
            System.out.println("Löytyi! " + kirjat.get(binaarihakuId));
        }

    }

    public static int perakkaishaku(ArrayList<Kirja> kirjat, int haettavaId) {
        int index = -1;
        for (int i = 0; i < kirjat.size(); i++) {
            Kirja kirja = kirjat.get(i);
            if (Objects.equals(kirja.getId(), haettavaId)) {
                index = i;
            }
        }
        return index;
    }

    public static int binaarihaku(ArrayList<Kirja> kirjat, long haettavaId) {
        int eka = 0;
        int viim = kirjat.size() - 1;
        int index = -1;

        while (eka <= viim) {
            int kesk = (eka + viim) / 2;
            if (kirjat.get(kesk).getId() == haettavaId) {
                index = kesk;
                break;
            } else if (kirjat.get(kesk).getId() < haettavaId) {
                eka = kesk + 1;
            } else if (kirjat.get(kesk).getId() > haettavaId) {
                viim = kesk - 1;
            }
        }
        return index;
    }
}

