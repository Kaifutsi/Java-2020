
public class Kuutio {
    private int sarmanPituus;


    public Kuutio(int sarmanPituus) {
        this.sarmanPituus = sarmanPituus;

    }

    public int tilavuus() {
        return sarmanPituus * sarmanPituus * sarmanPituus;

    }

    public String toString() {
        return "Kuution särmän pituus on " + sarmanPituus + ", " + "tilavuus on " + tilavuus();

    }



}
