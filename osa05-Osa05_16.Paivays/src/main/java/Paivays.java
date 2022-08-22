
public class Paivays {

    private int paiva;
    private int kuukausi;
    private int vuosi;

    public Paivays(int paiva, int kuukausi, int vuosi) {
        this.paiva = paiva;
        this.kuukausi = kuukausi;
        this.vuosi = vuosi;
    }

    public void etene() {
        this.paiva += 1;

        if (paiva > 30) {
            this.kuukausi += 1;
            this.paiva = 1;
            if (kuukausi > 12) {
                this.vuosi += 1;
                this.kuukausi = 1;
            }
        }
    }

    public void etene (int montakoPaivaa) {
        this.paiva += montakoPaivaa;
        if (paiva > 30) {
            this.kuukausi += 1;
            this.paiva = this.paiva - 30;
            if (kuukausi > 12) {
                this.kuukausi = this.kuukausi - 12;
                this.vuosi += 1;
            }
        }
    }

    public Paivays paivienPaasta(int paivia) {
        Paivays newPaiva = new Paivays(paiva, kuukausi, vuosi);

        if (!this.equals(newPaiva)) {
            if (paivia >= 0) {
                newPaiva.paiva += paivia;
                if (newPaiva.paiva > 30) {
                    newPaiva.paiva = newPaiva.paiva - 30;
                    newPaiva.kuukausi += 1;
                    if (newPaiva.kuukausi > 12) {
                        newPaiva.kuukausi = 1;
                        newPaiva.vuosi += 1;
                    }
                }
            }
            return newPaiva;
        }
        return new Paivays(this.paiva, this.kuukausi, this.vuosi);
    }

    @Override
    public String toString() {
        return this.paiva + "." + this.kuukausi + "." + this.vuosi;
    }

    public boolean aiemmin(Paivays verrattava) {
        if (this.vuosi < verrattava.vuosi) {
            return true;
        }

        if (this.vuosi == verrattava.vuosi && this.kuukausi < verrattava.kuukausi) {
            return true;
        }

        if (this.vuosi == verrattava.vuosi && this.kuukausi == verrattava.kuukausi &&
                 this.paiva < verrattava.paiva) {
            return true;
        }

        return this.vuosi == verrattava.vuosi && this.kuukausi == verrattava.kuukausi &&
                this.paiva < verrattava.paiva;

        
    }

}
