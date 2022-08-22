import java.util.ArrayList;

public class Huone {

    private final ArrayList<Henkilo> henkilot;

    public Huone() {
        this.henkilot = new ArrayList<>();

    }

    public void lisaa(Henkilo henkilo) {
        this.henkilot.add(henkilo);


    }

    public boolean onTyhja() {
        if(henkilot.isEmpty()) {
            return true;
        }
        return false;

    }

    public ArrayList<Henkilo> getHenkilot() {
        return this.henkilot;
        
    }

    public Henkilo lyhin() {
        if (this.henkilot.isEmpty()) {
            return null;
        }

        Henkilo lyh = this.henkilot.get(0);

        for (Henkilo hlo: this.henkilot) {
            
            if (lyh.getPituus() >  hlo.getPituus()) {
                lyh = hlo;
            }
        }
    
        // lopulta palautettavaa oliota kuvaava oliomuuttuja
        // palautetaan
        return lyh;
    }

    public Henkilo ota() {
        if (this.henkilot.isEmpty()) {
            return null;
        }
        
        Henkilo lyh = new Henkilo("", Integer.MAX_VALUE);

        for (Henkilo hlo: this.henkilot) {
            
            if (lyh.getPituus() >  hlo.getPituus()) {
                lyh = hlo;
            }
        }
        
        henkilot.remove(lyh);
        return lyh;

    }

}
