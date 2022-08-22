import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Ohjelma {

    public static void main(String[] args) {

        Scanner lukija = new Scanner(System.in);
        Vitsipankki pankki = new Vitsipankki();
        
        Kayttoliittyma liittyma = new Kayttoliittyma(pankki, lukija);
        liittyma.kaynnista();
    }
}
