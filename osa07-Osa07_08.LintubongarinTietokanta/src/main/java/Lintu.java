import java.text.MessageFormat;

public class Lintu {

    private final String nimi;
    private final String  latinankielinenNimi;
    private int havainto;

    public Lintu(String nimi, String latinankielinenNimi) {
        this.nimi = nimi;
        this.latinankielinenNimi = latinankielinenNimi;
        this.havainto = 0;
    }

    public String haeNimi() {
        return nimi;
    }

    public String haelatinankielinenNimi() {
        return latinankielinenNimi;
    }

    public void havaintojenmaaranKasvu() {
        this.havainto++;
    }

    @Override
    public String toString() {
        return MessageFormat.format("{0} ({1}): {2} havaintoa", nimi, latinankielinenNimi, havainto);
    }
}
