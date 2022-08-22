import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Reseptihaku {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mistä luetaan? ");
        final String file = scanner.nextLine();

        final List<Resepti> reseptit = readRecipesFromFile(file);
        System.out.println("Komennot: ");
        System.out.println("listaa - listaa reseptit");
        System.out.println("lopeta - lopettaa ohjelman");
        System.out.println("hae nimi - hakee reseptiä nimen perusteella");
        System.out.println("hae keittoaika - hakee reseptiä keittoajan perusteella");
        System.out.println("hae aine - hakee reseptiä raaka-aineen perusteella");

        while (true) {
            System.out.println("Syötä komento: ");
            final String input = scanner.nextLine();

            if ("listaa".equalsIgnoreCase(input)) {
                for (Resepti resepti : reseptit) {
                    System.out.println(resepti);
                }
            }

            if ("lopeta".equalsIgnoreCase(input)) {
                break;
            }

            if ("hae nimi".equalsIgnoreCase(input)) {
                System.out.println("Mitä haetaan: ");
                final String query = scanner.nextLine();
                for (Resepti resepti : reseptit) {
                    if (resepti.getNimi().contains(query)) {
                        System.out.println(resepti);
                    }
                }
            }

            if ("hae keittoaika".equalsIgnoreCase(input)) {
                System.out.println("Keittoaika korkeintaan: ");
                final int query = Integer.parseInt(scanner.nextLine());
                for (Resepti resepti : reseptit) {
                    if (resepti.getKeittoaika() <= query) {
                        System.out.println(resepti);
                    }
                }
            }

            if ("hae aine".equalsIgnoreCase(input)) {
                System.out.println("Mitä raaka-ainetta haetaan: ");
                final String query = scanner.nextLine();
                for (Resepti resepti : reseptit) {
                    for (String raakaaineet : resepti.getRaakaaineet()) {
                        if (Objects.equals(raakaaineet, query)) {
                            System.out.println(resepti);
                        }
                    }
                }
            }
        }

    }

    public static List<Resepti> readRecipesFromFile(String filename) {
        final List<Resepti> reseptit = new ArrayList<>();
        final List<String> reseptiOsat = new ArrayList<>();

        try (Scanner scanner = new Scanner(Paths.get(filename))) {
            while (scanner.hasNextLine()) {
                final String line = scanner.nextLine();
                if (!line.isEmpty()) {
                    reseptiOsat.add(line);
                } else {
                    reseptiosienJakaminen(reseptit, reseptiOsat);
                }
            }
            if (!reseptiOsat.isEmpty()) {
                reseptiosienJakaminen(reseptit, reseptiOsat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return reseptit;

    }

    private static void reseptiosienJakaminen(List<Resepti> reseptit, List<String> reseptiOsat) {
        String reseptiNimi;
        int keittoaika;
        reseptiNimi = reseptiOsat.get(0);
        keittoaika = Integer.parseInt(reseptiOsat.get(1));
        reseptiOsat.remove(0);
        reseptiOsat.remove(0);
        reseptit.add(new Resepti(reseptiNimi, keittoaika, new ArrayList<>(reseptiOsat)));
        reseptiOsat.clear();
    }

}
