import java.util.ArrayList;

public class Gebruiker
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
    public void addOptieLijst(EssentieleOptie essentieleOptie, ExtraOptie extraOptie){
        essentieleOpties.add(essentieleOptie);
        extraOpties.add(extraOptie);
    }

    public void printOptieLijst(){
        System.out.println("De volgende essentiele opties zijn: ");
        for(EssentieleOptie essentieleLijst: essentieleOpties){
            System.out.println(essentieleLijst);
        }
        System.out.println("De volgende extra opties zijn: ");
        for(ExtraOptie extraLijst: extraOpties){
            System.out.println(extraLijst);
        }

    }
    public void printOptieLijst(ArrayList<EssentieleOptie>essentieleOpties, ArrayList<ExtraOptie>Opties){

    }

}
