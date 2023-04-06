public class MilieuKorting {
    protected int kortingPercentage;
    protected String beschrijving;

    public MilieuKorting(int kortingPercentage) {
        this.kortingPercentage = kortingPercentage;
    }
    public MilieuKorting(int kortingPercentage, String beschrijving) {
        this.kortingPercentage = kortingPercentage;
        this.beschrijving = beschrijving;
    }

    public int getKortingsPercentage() {return kortingPercentage;}
    public void setKortingsPercentage(int kortingsPercentage) {this.kortingPercentage = kortingsPercentage;}
    public String getBeschrijving() {return beschrijving;}
    public void setBeschrijving(String beschrijving) {this.beschrijving = beschrijving;}
}
