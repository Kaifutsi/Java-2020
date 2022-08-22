
import java.util.ArrayList;
import java.util.Scanner;

public class ListanSuurinLuku {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        ArrayList<Integer> lista = new ArrayList<>();

        int sur = 0;
        while (true) {
            int luettu = Integer.valueOf(lukija.nextLine());
            if (luettu == -1) {
                System.out.println("");
                break;
            }
            for(int i=0; i<luettu; i++){
                if (sur<i){
                    sur=i;
                }
            }
            lista.add(luettu);
        }
        int surl=sur+1;     
        System.out.println(surl);
        
        // toteuta listan suurimman luvun selvittäminen tänne
    }
}
