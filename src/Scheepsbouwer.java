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

    // dit print alle klantTypes uit in deze format (index: klanttype) <Sayf>
    public void printKlantType(){
        klantTypes.forEach( (n)->System.out.printf("%d: %s%n",klantTypes.indexOf(n),n.getKlanttype()) );
    }
    //-----------------------------------------------------------------------------------
    public void addEssentieleOptie(EssentieleOptie essentieleOptie){
        getEssentieleOpties().add(essentieleOptie);
    }
    //van welke object ben je de getEssentieleOpties aan het roepen? <Sayf>
    public void deleteEssentieleOptie(EssentieleOptie essentieleOptie){
        getEssentieleOpties().remove(essentieleOptie);
    }
    //-------------------------------------------------------------------------------------

    public void addExtraOpties(ExtraOptie extraOptie){
        getExtraOptie().add(extraOptie);
    }
    // van welke object ben je de getExtraOptie aan het roepen? <Sayf>
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
