
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Agentti bond = new Agentti("James", "Bond");

        bond.toString(); // ei tulosta mitään
        System.out.println(bond);
        
        Agentti ionic = new Agentti("Ionic", "Bond");
        System.out.println(ionic);

    }
}
