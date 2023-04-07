import java.util.ArrayList;
public class EssentieleOptie extends Optie{
    private String essentieleOptie;
    private double kostenEssentieleOptie;

    public EssentieleOptie(String essentieleOptie, String omschrijvingOptie, double kostenEssentieleOptie) {
        super(omschrijvingOptie);
        this.essentieleOptie = essentieleOptie;
        this.kostenEssentieleOptie = kostenEssentieleOptie;
    }

    public String getEssentieleOptie() {
        return essentieleOptie;
    }

    public void setEssentieleOptie(String essentieleOptie) {
        this.essentieleOptie = essentieleOptie;
    }

    public double getKostenEssentieleOptie() {
        return kostenEssentieleOptie;
    }

    public void setKostenEssentieleOptie(double kostenEssentieleOptie) {
        this.kostenEssentieleOptie = kostenEssentieleOptie;
    }
}