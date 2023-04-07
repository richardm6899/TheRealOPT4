public class KlantType extends MilieuKorting{
    private String klanttype;


    public KlantType(String klanttype, int kortingpercentage) {
        super(kortingpercentage);
        this.klanttype= klanttype;
    }

    public String getKlanttype() {

        return klanttype;
    }

    public void setKlanttype(String klanttype) {

        this.klanttype = klanttype;
    }
}
