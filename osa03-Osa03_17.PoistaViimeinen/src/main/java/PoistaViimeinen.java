
import java.util.ArrayList;

public class PoistaViimeinen {

    public static void main(String[] args) {
        ArrayList<String> merkkijonot = new ArrayList<>();
        merkkijonot.add("Eka");
        merkkijonot.add("Toka");
        merkkijonot.add("Kolmas");
        
        System.out.println(merkkijonot);
        
        poistaViimeinen(merkkijonot);
        poistaViimeinen(merkkijonot);
        
        System.out.println(merkkijonot);

    }

    public static void poistaViimeinen(ArrayList<String> merkkijonot) {
        if (merkkijonot.size() == 0) {
            return;
        }
    
        merkkijonot.remove(merkkijonot.get(merkkijonot.size() - 1));
    }
 //       int indeksi = 0;
   //     while (indeksi < merkkijonot.size()) {
    //        indeksi = indeksi + 1;
   //         if (merkkijonot.size() == indeksi) {
  //              return;
  //          }




}
