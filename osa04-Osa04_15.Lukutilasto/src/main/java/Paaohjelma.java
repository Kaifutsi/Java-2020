
import java.util.ArrayList;
import java.util.Scanner;

import javax.crypto.AEADBadTagException;

public class Paaohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        Lukutilasto tilasto = new Lukutilasto();
        Lukutilasto paril = new Lukutilasto();
        Lukutilasto parit = new Lukutilasto();
        
        ArrayList<Integer> Paaohjelma = new ArrayList<>();
        System.out.println("Anna lukuja: ");
        while (true) {
            int lukuja = Integer.valueOf(lukija.nextLine());
            if (lukuja < 0) {
                break;
            } else {
                tilasto.lisaaLuku(lukuja);
                
                if (lukuja % 2 == 0) {
                    paril.lisaaLuku(lukuja);
                }
                
                if (lukuja % 2 != 0) {
                    parit.lisaaLuku(lukuja);
                }
            }

        }
        System.out.println("Summa: " + tilasto.summa());
        System.out.println("Parillisten summa: " + paril.summa());
        System.out.println("Parittomien summa: " + parit.summa());

        
       // tilasto.lisaaLuku(3);
       // tilasto.lisaaLuku(5);
       // tilasto.lisaaLuku(1);
       // tilasto.lisaaLuku(2);
     //   System.out.println("Määrä: " + tilasto.haeLukujenMaara());
      //  System.out.println("Summa: " + tilasto.summa());
     //   System.out.println("Keskiarvo: " + tilasto.keskiarvo());
    }
}
