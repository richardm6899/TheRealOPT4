
import java.util.ArrayList;
import java.util.Arrays;

public class Offerte {
    private KlantType klanttype;
    private double totaalPrijs;
    private ArrayList<EssentieleOptie> gekozenEssentieleOpties = new ArrayList<>();
    private ArrayList<ExtraOptie> gekozenExtraOpties = new ArrayList<>();

    public Offerte(KlantType klanttype) {
        this.klanttype = klanttype;
    }
    //berekent totaal prijs. inclusief kortingspercentage
    public void berekenTotaalPrijs() {
        for (EssentieleOptie esOptie:gekozenEssentieleOpties) {
            totaalPrijs += esOptie.getKostenEssentieleOptie();
        }
        for (ExtraOptie exOptie:gekozenExtraOpties) {
            totaalPrijs += exOptie.getKostenExtraOptie();
        }
        System.out.printf("         subtotaal:...............%.2f euro%n",totaalPrijs);
        double korting = totaalPrijs* (klanttype.getKortingsPercentage()/100);
        System.out.printf("         Klantkorting:............%.2f euro (%.1f",korting,klanttype.getKortingsPercentage());
        System.out.println("%)");
        System.out.println("         ______________________________________");
        totaalPrijs*= 1-(klanttype.getKortingsPercentage()/100);
        totaalPrijs*= 1.21;
        System.out.print("         totaal (20% btw):........");
        System.out.printf("%.2f euro%n",totaalPrijs);
    }

    public void addGekozenEssentieleOpties(EssentieleOptie gekozenEssentieleOptie) {
        gekozenEssentieleOpties.add(gekozenEssentieleOptie);
    }
    public void printGekozenOpties(){
        System.out.println("         Essentiele Opties:");
        gekozenEssentieleOpties.forEach( (n)->System.out.printf("         - %s...................%.2f euro%n",n.getEssentieleOptie(),n.getKostenEssentieleOptie()) );
        System.out.println("         Extra Opties:");
        gekozenExtraOpties.forEach( (n)->System.out.printf("         - %s.............%.2f euro%n",n.getExtraOptie(),n.getKostenExtraOptie()) );
    }


    public void addGekozenExtraOpties(ExtraOptie gekozenExtraOptie) {
        gekozenExtraOpties.add(gekozenExtraOptie);
    }
}
