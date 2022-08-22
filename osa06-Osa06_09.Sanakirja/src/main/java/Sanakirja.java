import java.util.HashMap;

public class Sanakirja {
    private HashMap<String, String> sanakirja; 
    
    
    public Sanakirja (){
        this.sanakirja = new HashMap<>();
        
    }
    public void lisaa(String sana, String kaannos) {
       this.sanakirja.put(sana, kaannos);
       
    }
    public String kaanna(String sana){
        return sanakirja.get(sana);
    }
} 
