import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final List<Lintu> linnut = new ArrayList<>();

        while (true) {
            System.out.print("? ");
            final String komento = scanner.nextLine();

            if ("Lopeta".equalsIgnoreCase(komento)) {
                break;
            }

            if ("Nayta".equalsIgnoreCase(komento)) {
                System.out.print("Mikä? ");
                final String nimi = scanner.nextLine();

                linnut.stream()
                        .filter(b -> Objects.equals(b.haeNimi(), nimi))
                        .findFirst()
                        .ifPresent(System.out::println);
            }

            if ("lisaa".equalsIgnoreCase(komento)) {
                System.out.print("Nimi: ");
                final String nimi = scanner.nextLine();
                System.out.print("Latinankielinen nimi: ");
                final String latinankielinenNimi = scanner.nextLine();

                linnut.add(new Lintu(nimi, latinankielinenNimi));
            }

            if ("Havainto".equalsIgnoreCase(komento)) {
                System.out.print("Mikä havaittu?  ");
                final String nimi = scanner.nextLine();

                final Lintu pyyLintu = linnut.stream()
                        .filter(b -> Objects.equals(b.haeNimi(), nimi))
                        .findFirst()
                        .orElse(null);

                if (pyyLintu == null) {
                    System.out.println("Ei ole lintu!");
                    continue;
                }
                pyyLintu.havaintojenmaaranKasvu();

            }

            if ("Tilasto".equalsIgnoreCase(komento)) {
                for (Lintu lintu : linnut) {
                    System.out.println(lintu);
                }
            }
        }
    }

}
