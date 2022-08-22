
import java.util.Scanner;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

public class Tekstikayttoliittyma {

    private final Scanner scanner;
    private final Sanakirja sanakirja;


    public Tekstikayttoliittyma(Scanner scanner, Sanakirja sanakirja){
        this.scanner = scanner;
        this.sanakirja = sanakirja;
        }
    public void kaynnista() {
        final List<String> kom = new ArrayList<>();
        kom.add("lopeta");
        kom.add("lisaa");
        kom.add("hae");


            
        while (true) {
            System.out.print("Komento: ");
            String komento = this.scanner.nextLine();
    
            if (!kom.contains(komento)) {
                    System.out.println("Tuntematon komento");
            }
            
            if ("lopeta".equalsIgnoreCase(komento)){
                    System.out.print("Hei hei!");
                    break;
            }

            if ("lisaa".equalsIgnoreCase(komento)){
                System.out.print("Sana: ");
                final String sana = scanner.nextLine();
                
                System.out.print("Käännos: ");
                    
                final String kaannos = scanner.nextLine();
                sanakirja.lisaa(sana, kaannos);
            }

            if ("hae".equalsIgnoreCase(komento)){
                System.out.print("Haettava: ");
                final String sanaKaannos = scanner.nextLine();
                final String kaannos = sanakirja.kaanna(sanaKaannos);

                if (kaannos == null) {
                    System.out.print(MessageFormat.format("Sanaa {0} ei löydy", sanaKaannos));
                }else {
                    System.out.println(kaannos);
                }
            }
    
        }
    
    }
}