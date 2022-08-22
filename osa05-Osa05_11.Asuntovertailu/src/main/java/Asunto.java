
public class Asunto {

    private int huoneita;
    private int nelioita;
    private int neliohinta;

    public Asunto(int huoneita, int nelioita, int neliohinta) {
        this.huoneita = huoneita;
        this.nelioita = nelioita;
        this.neliohinta = neliohinta;
    }

    public boolean kalliimpi (Asunto verrattava) {
        // ensin verrataan vuosia
        return this.nelioita > verrattava.nelioita;
    }

    public int hintaero (Asunto verrattava) {
        int hinta = this.nelioita * this.neliohinta;
        return Math.abs(verrattava.neliohinta * verrattava.nelioita - hinta);
    }

    public boolean suurempi (Asunto verrattava) {
        return this.neliohinta * this.nelioita > verrattava.nelioita * verrattava.neliohinta;

    }
}
