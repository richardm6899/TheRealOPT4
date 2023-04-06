import java.util.ArrayList;

public class Gebruiker
{
    private String naam;
    private ArrayList<EssentieleOptie>essentieleOpties;
    private ArrayList<ExtraOptie>extraOptie;

    public Gebruiker(String naam, ArrayList<EssentieleOptie> essentieleOpties, ArrayList<ExtraOptie> extraOptie)
    {
        this.naam = naam;
        this.essentieleOpties = essentieleOpties;
        this.extraOptie = extraOptie;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public ArrayList<EssentieleOptie> getEssentieleOpties() {
        return essentieleOpties;
    }

    public void setEssentieleOpties(ArrayList<EssentieleOptie> essentieleOpties) {
        this.essentieleOpties = essentieleOpties;
    }

    public ArrayList<ExtraOptie> getExtraOptie() {
        return extraOptie;
    }

    public void setExtraOptie(ArrayList<ExtraOptie> extraOptie) {
        this.extraOptie = extraOptie;
    }

    public void printOptieLijst(ArrayList<EssentieleOptie>essentieleOpties, ArrayList<ExtraOptie>extraOptie){

    }
}
