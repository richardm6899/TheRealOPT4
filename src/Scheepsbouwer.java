import java.util.ArrayList;

public class Scheepsbouwer extends Gebruiker{
    //up to date
    private ArrayList<KlantType>klantTypes;
    private String Wachtwoord;

    public Scheepsbouwer(String naam, String Wachtwoord, ArrayList<EssentieleOptie> essentieleOpties, ArrayList<ExtraOptie> extraOptie, ArrayList<KlantType> klantTypes) {
        super(naam, essentieleOpties, extraOptie);
        this.klantTypes = klantTypes;
        this.Wachtwoord = Wachtwoord;
    }


    public void printKlantType(){

    }
    //-----------------------------------------------------------------------------------
    public void addEssentieleOptie(ArrayList<EssentieleOptie>essentieleOpties){

    }

    public void deleteEssentieleOptie(ArrayList<EssentieleOptie>essentieleOpties){

    }
    //-------------------------------------------------------------------------------------

    public void addExtraOpties(ArrayList<ExtraOptie>extraOpties){

    }

    public void deleteExtraOpties(ArrayList<ExtraOptie>extraOpties){

    }
    //--------------------------------------------------------------------------------------
    public void addKlantType(ArrayList<KlantType>klantTypes){

    }

    public void deleteKlantType(ArrayList<KlantType>klantTypes){

    }



}
