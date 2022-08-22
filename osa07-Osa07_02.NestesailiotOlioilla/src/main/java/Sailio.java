public class Sailio {

    private int ensimSailio;

    public int sisalto() {
        return ensimSailio;

    }

    public void lisaa(int maara) {
        if (maara >= 0) {
            ensimSailio = (ensimSailio + maara > 100) ? 100: ensimSailio + maara;
        }
    }

    public void poista(int maara) {
        if (maara >= 0) {
            ensimSailio = (ensimSailio - maara < 0) ? 0: ensimSailio - maara;
        }
    }

    public String toString() {
        return this.ensimSailio + "/100";
    }



}

