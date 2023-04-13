
import java.util.ArrayList;
import java.util.Arrays;

public class Offerte {
    private String klanttype;
    private ArrayList<String> gekozenOpties;

    public Offerte(String klanttype, ArrayList<String> gekozenOpties) {
        this.gekozenOpties = gekozenOpties;
        this.klanttype = klanttype;
    }

    public int berekenTotaalPrijs(boolean extraOptie, boolean isKlant) {
        int totaalPrijs = basisPrijs;
        if (extraOptie) {
            totaalPrijs += extraOptiePrijs;
        }
        if (isKlant) {
            totaalPrijs -= klantKorting;
        }
        return totaalPrijs;
    }

    int basisPrijs = 500;
    int extraOptiePrijs = 200;
    int klantKorting = 300;
}
