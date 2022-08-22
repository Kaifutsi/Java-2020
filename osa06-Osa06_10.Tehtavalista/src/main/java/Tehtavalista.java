import java.util.ArrayList;
import java.util.List;

public class Tehtavalista {
    private final List<String> tehtavat = new ArrayList<>();


    public void lisaa(String tehtava) {
        this.tehtavat.add(tehtava);
    }


    public void tulosta() {
        int i=0;
        for(i=0; i<tehtavat.size(); i++) {
            System.out.println(i + 1 + ": " + tehtavat.get(i));
        }
    }

    public void poista(int numero) {
        tehtavat.remove(numero - 1);
    }

}
