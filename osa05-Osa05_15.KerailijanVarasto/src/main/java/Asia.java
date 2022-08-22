

public class Asia {
    @Override
    public String toString() {
        return tunnus + ": " + nimi;
    }

    public Asia(String tunnus, String nimi) {
        this.tunnus = tunnus;
        this.nimi = nimi;
    }

    
    private String tunnus;
    private String nimi;

    public String getTunnus() {
        return tunnus;

    }

    public void setTunnus(String tunnus) {
        this.tunnus = tunnus;
    }

    public Asia() {

    }

    public boolean equals(Object compared) {
        Asia asia = (Asia)compared;
        return this.tunnus.equals(asia.tunnus);

    }

    public String getNimi() {
    return nimi;

    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }
    

}
