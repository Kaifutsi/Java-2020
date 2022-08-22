
public class Ohjelma {

    public static void main(String[] args) {
        Laskuri laskuri = new Laskuri(1);
        laskuri.lisaa();
        laskuri.lisaa(3);
        laskuri.vahenna();
        laskuri.vahenna(2);
        System.out.println(laskuri.arvo());
    }
}
