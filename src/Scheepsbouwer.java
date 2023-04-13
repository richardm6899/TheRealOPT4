import java.util.ArrayList;
import java.util.Scanner;

public class Scheepsbouwer extends Gebruiker{
    //up to date
    private ArrayList<KlantType>klantTypes;
    private String Wachtwoord;

    public Scheepsbouwer(String naam, String Wachtwoord, ArrayList<KlantType> klantTypes) {
        super(naam);
        this.klantTypes = klantTypes;
        this.Wachtwoord = Wachtwoord;
    }
    //Geeft toegang tot the private String wachtwoord van de scheepsbouwer.
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

    //Geeft een keuze menu weer waarin je kan kiezen welke lijst je wilt bekijken.
    public static void scheepsBouwer(ArrayList<KlantType> klantTypes, ArrayList<EssentieleOptie> essentieleOpties, ArrayList<ExtraOptie> extraOpties, Scanner sc, Scheepsbouwer richard){
        System.out.println("Welke Lijst wilt u weergeven?");
        System.out.println("1: KlantType lijst");
        System.out.println("2: Optie lijst (essentiel en extra)");
        System.out.println("0: Terug naar Menu");
        int choice = sc.nextInt();
        sc.nextLine();

        if (choice == 1) {
            KlantType.lijstKlantType(klantTypes, sc);
        }
        if (choice == 2) {
            Optie.lijstOpties(essentieleOpties, extraOpties, sc);
            choice = sc.nextInt();
            sc.nextLine();
            if (choice == 1){
                Optie.optieToevoegen(essentieleOpties, extraOpties, sc, richard, klantTypes);
            }
            if (choice == 2){

            }
            if (choice == 0){
                scheepsBouwer(klantTypes, essentieleOpties, extraOpties, sc, richard);
            }
        }
        if (choice == 0) {
            Welkom.welkomScreen(klantTypes, essentieleOpties, extraOpties, sc, richard);
        }
        if (choice != 1 || choice != 2|| choice != 3){
            System.out.println("onjuiste keuze");
            scheepsBouwer(klantTypes, essentieleOpties, extraOpties, sc, richard);
        }
    }

}
