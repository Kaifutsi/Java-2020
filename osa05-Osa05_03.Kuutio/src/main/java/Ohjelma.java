
import java.util.Scanner;

public class Ohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        Kuutio oSheaJackson = new Kuutio(4);
        System.out.println(oSheaJackson.tilavuus());
        System.out.println(oSheaJackson);
        
        System.out.println();
        
        Kuutio suola = new Kuutio(2);
        System.out.println(suola.tilavuus());
        System.out.println(suola);
    }
}
