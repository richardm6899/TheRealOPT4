import java.util.ArrayList;

public class ExtraOptie extends Optie {
    private String extraOptie;
    private double kostenExtraOptie;


    public ExtraOptie(String omschrijvingOptie, String extraOptie, double kostenExtraOptie) {
        super(omschrijvingOptie);
        this.extraOptie = extraOptie;
        this.kostenExtraOptie = kostenExtraOptie;
    }
    public String getExtraOptie() {
        return extraOptie;
    }

    public void setExtraOptie(String extraOptie) {
        this.extraOptie = extraOptie;
    }

    public double getKostenExtraOptie() {
        return kostenExtraOptie;
    }

    public void setKostenExtraOptie(double kostenExtraOptie) {
        this.kostenExtraOptie = kostenExtraOptie;
    }
}
