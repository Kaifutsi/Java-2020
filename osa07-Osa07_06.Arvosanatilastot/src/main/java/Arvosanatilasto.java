import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Arvosanatilasto {
    private final ArrayList<Integer> arvosanat;
    private final ArrayList<Integer> pisteet = new ArrayList<>();

    public Arvosanatilasto() {
        this.arvosanat = new ArrayList<>();
    }  
    
    public void lisaaArvosanaPisteet(int pisteet) {
        this.arvosanat.add(ArvosanaPisteet(pisteet));
        this.pisteet.add(pisteet);
    }    
    
    public int pisteetLukumaara(int arvosana) {
        int luku = 0;
        for (int i : this.arvosanat) {
            if (i == arvosana) {
                luku++;
            }
        }

        return luku;
    }   
    
    public void haePisteetKeskimaara() {
        final double pisteetKeskimaara = pisteet.stream()
                .mapToDouble(p -> p)
                .average()
                .orElse(-1);

        System.out.println("Pisteiden keskiarvo (kaikki): " + pisteetKeskimaara);
    }    

    public int ArvosanaPisteet(int pisteet) {
        int arvosana;
        if (pisteet < 50) {
            arvosana = 0;
        } else if (pisteet < 60) {
            arvosana = 1;
        } else if (pisteet < 70) {
            arvosana = 2;
        } else if (pisteet < 80) {
            arvosana = 3;
        } else if (pisteet < 90) {
            arvosana = 4;
        } else {
            arvosana = 5;
        }

        return arvosana;
    }    

    public void tulostusArvo() {
        int arvosana = 5;
        System.out.println("Hyväksymisprosentti: " + getHyväksymisprosentti());
        System.out.print("Arvosanajakauma: " + "\n");
        while (arvosana >= 0) {
            int a = pisteetLukumaara(arvosana);
            System.out.print(arvosana + ": ");
            tulostusTahdet(a);
            System.out.println("");

            arvosana = arvosana - 1;
        }
    } 
    
    public void tulostusTahdet(int tahdet) {
        while (tahdet > 0) {
            System.out.print("*");
            tahdet--;
        }
    }  
    
    public void tulostusSyöttöpisteidenkeskiarvo() {
        final double keskimaara = pisteet.stream()
                .mapToDouble(p -> p)
                .filter(p -> p >= 50)
                .average()
                .orElse(-1);

        String tulos = "Pisteiden keskiarvo (hyväksytyt): ";
        tulos += keskimaara != -1 ? Double.valueOf(keskimaara) : "-";

        System.out.println(tulos);
    }    

    public double getHyväksymisprosentti() {
        final List<Integer> hyväksytytArvosanat = pisteet.stream()
                .filter(p -> p >= 50)
                .collect(Collectors.toList());

        return 100.0 * hyväksytytArvosanat.size() / pisteet.size();
    }    

}
