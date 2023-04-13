import java.util.ArrayList;

public abstract class Gebruiker
{
    private String naam;
    private ArrayList<EssentieleOptie> essentieleOpties;
    private ArrayList<ExtraOptie> extraOpties;

    public Gebruiker(String naam, ArrayList<EssentieleOptie> essentieleOpties, ArrayList<ExtraOptie> extraOpties)
    {
        this.naam = naam;
        this.essentieleOpties = essentieleOpties;
        this.extraOpties = extraOpties;
    }
    //deze constructor zit hier om het inloggen te testen. <Sayf>
    public Gebruiker(String naam){
        this.naam = naam;
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
        return extraOpties;
    }

    public void setExtraOptie(ArrayList<ExtraOptie> extraOpties) {
        this.extraOpties = extraOpties;
    }

    public void printOptieLijst(ArrayList<EssentieleOptie> essentieleOpties, ArrayList<ExtraOptie> extraOpties) {
        System.out.println("De volgende essentiele opties zijn: ");
        for (EssentieleOptie essentieleLijst : essentieleOpties) {
            System.out.println(essentieleLijst.getEssentieleOptie());
        }
        System.out.println("De volgende extra opties zijn: ");
        for (ExtraOptie extraLijst : extraOpties) {
            System.out.println(extraLijst.getExtraOptie());
        }
    }

}
