import java.util.ArrayList;

public class Scheepsbouwer extends Gebruiker{
    //up to date
    private ArrayList<KlantType>klantTypes;
    private String Wachtwoord;

    public Scheepsbouwer(String naam, String Wachtwoord, ArrayList<KlantType> klantTypes) {
        super(naam);
        this.klantTypes = klantTypes;
        this.Wachtwoord = Wachtwoord;
    }

    public String getWachtwoord(){
        return Wachtwoord;
    }

    // dit print alle klantTypes uit in deze format (index: klanttype) <Sayf>
    public void printKlantType(){
        klantTypes.forEach( (n)->System.out.printf("%d: %s%n",klantTypes.indexOf(n),n.getKlanttype()) );
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
    public void addKlantType(KlantType klantType){
        klantTypes.add(klantType);
    }

    public void deleteKlantType(KlantType klantType){
        klantTypes.remove(klantType);
    }



}
