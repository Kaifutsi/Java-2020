
import java.util.ArrayList;

public class Pakka {

    private ArrayList<String> lista;

    public Pakka() {
        this.lista = new ArrayList<>();
    }

    public boolean onTyhja() {
        return this.lista.isEmpty();

    }

    public void lisaa(String arvo) {
        this.lista.add(arvo);

    }

    public ArrayList<String> arvot() {
        return lista;

    }

    public String ota() {
        String suur = lista.get(lista.size() - 1);
        this.lista.remove(suur);
        return suur;

    }
}
