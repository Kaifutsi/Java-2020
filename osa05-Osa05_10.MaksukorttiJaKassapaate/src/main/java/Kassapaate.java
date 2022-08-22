
public class Kassapaate {


    private double rahaa;  // kassassa olevan käteisen määrä
    private int edulliset; // myytyjen edullisten lounaiden määrä
    private int maukkaat;  // myytyjen maukkaiden lounaiden määrä


    public Kassapaate() {
        rahaa = 1000;
        
        
    }

    public boolean syoEdullisesti (Maksukortti kortti) {
        // an affordable meal costs 2.50 euros
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned
        if (kortti.saldo() >= 2.5) {
            kortti.otaRahaa(2.5);
            edulliset++;
            return true;
        }
        return false;
    }

    public void lataaRahaaKortille (Maksukortti kortti, double sum) {
        if (sum >= 0) {
            kortti.lataaRahaa(sum);
            this.rahaa += sum;
        }
    }

    public boolean syoMaukkaasti (Maksukortti kortti) {
        if (kortti.saldo() >= 4.3) {
            kortti.otaRahaa(4.3);
            maukkaat++;
            return true;
        }
        return false;
    }

    public double syoEdullisesti(double maksu) {
        if (maksu >= 2.50) {
            edulliset++;
            this.rahaa += 2.50;
            return maksu - 2.50;
        }
        // edullinen lounas maksaa 2.50 euroa.
        // päivitetään kassan rahamäärää lounaan hinnalla ja palautetaan vaihtorahat
        // jos parametrina annettu maksu ei ole riittävän suuri, ei lounasta myydä ja metodi palauttaa koko summan
        return maksu;
    }

    public double syoMaukkaasti(double maksu) {
        if (maksu >= 4.30) {
            maukkaat++;
            this.rahaa += 4.30;
            return maksu - 4.30;
        }
        // maukas lounas maksaa 4.30 euroa.
        // päivitetään kassan rahamäärää lounaan hinnalla ja palautetaan vaihtorahat
        // jos parametrina annettu maksu ei ole riittävän suuri, ei lounasta myydä ja metodi palauttaa koko summan
        return maksu;
    }


    @Override
    public String toString() {
        return "kassassa rahaa " + rahaa + " edullisia lounaita myyty " +
               edulliset + " maukkaita lounaita myyty " + maukkaat;
    }
}
