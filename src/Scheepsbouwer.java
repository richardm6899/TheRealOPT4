import java.util.ArrayList;

public class Scheepsbouwer extends Gebruiker{
    //up to date
    private ArrayList<KlantType>klantTypes;
    private String Wachtwoord;

    public Scheepsbouwer(String naam, String Wachtwoord, ArrayList<EssentieleOptie> essentieleOpties, ArrayList<ExtraOptie> extraOpties, ArrayList<KlantType> klantTypes) {
        super(naam, essentieleOpties, extraOpties);
        this.klantTypes = klantTypes;
        this.Wachtwoord = Wachtwoord;
    }


    public void printKlantType(){

    }
    //-----------------------------------------------------------------------------------
    public void addEssentieleOptie(EssentieleOptie essentieleOptie){
        getEssentieleOpties().add(essentieleOptie);
    }

    public void deleteEssentieleOptie(EssentieleOptie essentieleOptie){
        getEssentieleOpties().remove(essentieleOptie);
    }
    //-------------------------------------------------------------------------------------

    public void addExtraOpties(ExtraOptie extraOptie){
        getExtraOptie().add(extraOptie);
    }

    public void deleteExtraOpties(ExtraOptie extraOptie){
        getExtraOptie().remove(extraOptie);
    }
    //--------------------------------------------------------------------------------------
    public void addKlantType(ArrayList<KlantType>klantTypes){

    }

    public void deleteKlantType(ArrayList<KlantType>klantTypes){

    }



}
