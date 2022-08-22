public class Maksukortti {
    private double saldo;

    public Maksukortti(double alkusaldo) {
        this.saldo = alkusaldo;

    }

    public String toString() {
        return "Kortilla on rahaa " + this.saldo + " euroa";
    }

    public void syoEdullisesti() {
        if (this.saldo - 2.60 >= 0) {
            this.saldo = this.saldo - 2.60;
        }
    }

    public void syoMaukkaasti() {
        if (this.saldo - 2.60 >= 0) {
            this.saldo = this.saldo - 4.60;
        }
    }

    public void lataaRahaa(double rahamaara) {
        double raha = 0;
        double over = 0;

        if (rahamaara > 0) {
            raha = this.saldo + rahamaara;
            over = raha - 150;
            
            if (raha > 150) {
                raha -= over;

            }
            this.saldo = raha;
        }
    }

}