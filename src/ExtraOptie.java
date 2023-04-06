public class ExtraOptie extends Optie {
    private String extraoptie;

    public ExtraOptie(String omschrijvingoptie, String extraoptie) {
        super(omschrijvingoptie);
        this.extraoptie = extraoptie;
    }

    public String getExtraoptie() {
        return extraoptie;
    }

    public void setExtraoptie(String extraoptie) {
        this.extraoptie = extraoptie;
    }
}
