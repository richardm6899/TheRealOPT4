public class EssentieleOptie extends Optie{
    private String essentieleoptie;

    public EssentieleOptie(String essentieleoptie, String omschrijvingoptie) {
        super(omschrijvingoptie);
        this.essentieleoptie = essentieleoptie;
    }

    public String getEssentieleOptie() {
        return essentieleoptie;
    }

    public void setEssentieleOptie(String essentieleoptie) {
        this.essentieleoptie = essentieleoptie;
    }
}
