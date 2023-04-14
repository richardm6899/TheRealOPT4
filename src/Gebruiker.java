import java.util.ArrayList;
import java.util.Scanner;

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
        System.out.println("----------------------------------------------------------");
        System.out.println("De volgende essentiele opties zijn: ");
        System.out.println("----------------------------------------------------------");
        for (EssentieleOptie essentieleOptie : essentieleOpties) {
            System.out.println("- " + essentieleOptie.getEssentieleOptie() + ": " + essentieleOptie.getOmschrijvingOptie() + " (€" + essentieleOptie.getKostenEssentieleOptie() + ")");
        }
        System.out.println("----------------------------------------------------------");
        System.out.println("De volgende extra opties zijn: ");
        System.out.println("----------------------------------------------------------");
        for (ExtraOptie extraOptie : extraOpties) {
            System.out.println("- " + extraOptie.getExtraOptie() + ": " + extraOptie.getOmschrijvingOptie() + " (€" + extraOptie.getKostenExtraOptie() + ")");
        }
    }

    public static void gegevensInvullen(ArrayList<KlantType> klantTypes, ArrayList<EssentieleOptie> essentieleOpties, ArrayList<ExtraOptie> extraOpties, Scanner sc) {
        //vraagt gegevens en slaat deze op.
        System.out.println("Vul je naam in:");
        String naam = sc.nextLine();
        System.out.println("Vul je emailadres in:");
        String email = sc.nextLine();
        System.out.println("Vul je adres in:");
        String adres = sc.nextLine();
        System.out.println("Vul je telefoon nummer in:");
        int telefoonnr = sc.nextInt();
        //print klanttypes uit en vraagt je om te kiezen.
        System.out.println("Kies je klant type:");
        klantTypes.forEach((n) -> System.out.printf("%d: %s%n", klantTypes.indexOf(n) + 1, n.getKlanttype()));
        int keuze = sc.nextInt();
        //maakt het klant object aan.
        Klant klant = new Klant(naam, essentieleOpties, extraOpties, email, adres, telefoonnr, klantTypes.get(keuze-1));
        Offerte offerte = new Offerte(klant.getKlantType());
        klant.printOptieLijst(essentieleOpties, extraOpties);
        selecteerOpties(offerte,essentieleOpties, extraOpties, sc);

    }

    public static void selecteerOpties(Offerte offerte, ArrayList<EssentieleOptie> essentieleOpties, ArrayList<ExtraOptie> extraOpties, Scanner sc){

        System.out.println("Selecteer jouw optie");
        int keuze = sc.nextInt();
        if(keuze < essentieleOpties.size()) {
            System.out.println("-" + essentieleOpties.get(keuze - 1).getEssentieleOptie() + ": " + essentieleOpties.get(keuze - 1).getOmschrijvingOptie() + " (€" + essentieleOpties.get(keuze - 1).getKostenEssentieleOptie() + ")");
            offerte.addGekozenEssentieleOpties(essentieleOpties.get(keuze - 1));
        }
        else{
            System.out.println(extraOpties.get(keuze - 1 - essentieleOpties.size()).getExtraOptie());
            offerte.addGekozenExtraOpties( extraOpties.get(keuze - 1 - essentieleOpties.size()) );
        }
        System.out.println("Heb je alles geselecteerd?");
        System.out.println("1: ja");
        System.out.println("2: nee");


        int keuze2 = sc.nextInt();
        if(keuze2 == 1){
            System.out.println("Keuze voltooid");
            offerte.printGekozenOpties();
            offerte.berekenTotaalPrijs();
            //logoPage(sc);
        }
        else if ( keuze2 == 2) {
            selecteerOpties(offerte, essentieleOpties, extraOpties, sc);
        }
    }

}
