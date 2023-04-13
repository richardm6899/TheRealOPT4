public class MilieuKorting {
    protected double kortingPercentage;
    protected String beschrijving;

    public MilieuKorting(int kortingPercentage) {
        this.kortingPercentage = kortingPercentage;
    }
    public MilieuKorting(int kortingPercentage, String beschrijving) {
        this.kortingPercentage = kortingPercentage;
        this.beschrijving = beschrijving;
    }

    public double getKortingsPercentage() {return kortingPercentage;}
    public void setKortingsPercentage(int kortingsPercentage) {this.kortingPercentage = kortingsPercentage;}
    public String getBeschrijving() {return beschrijving;}
    public void setBeschrijving(String beschrijving) {this.beschrijving = beschrijving;}
}
