import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Kayttoliittyma {

    private final Tehtavalista tehtavalista;
    private final Scanner scanner;

    public Kayttoliittyma(Tehtavalista tehtavalista, Scanner scanner) {

        this.tehtavalista = tehtavalista;
        this.scanner = scanner;
    }


    public void kaynnista() {
        final List<String> komennot = new ArrayList<>();
        komennot.add("lopeta");
        komennot.add("lisaa");
        komennot.add("listaa");
        komennot.add("poista");

        while (true) {
            System.out.print("Komento: ");
            String kom = scanner.nextLine();
            if (!komennot.contains(kom)) {
                System.out.println("Tuntematon komento");
            }

            if ("lopeta".equalsIgnoreCase(kom)) {
                break;
            }

            if ("lisaa".equalsIgnoreCase(kom)) {
                System.out.print("Lisättävä: ");
                final String tehtavaLisaa = scanner.nextLine();
                tehtavalista.lisaa(tehtavaLisaa);
            }

            if ("listaa".equalsIgnoreCase(kom)) {
                tehtavalista.tulosta();
            }

            if ("poista".equalsIgnoreCase(kom)) {
                System.out.print("Mikä poistetaan? ");
                final int numeroPoista = Integer.parseInt(scanner.nextLine());
                tehtavalista.poista(numeroPoista);
            } 
        }       


    }


    
}
