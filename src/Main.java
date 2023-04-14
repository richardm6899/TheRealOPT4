import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        //Logo voor welkom.
        Welkom.logoPage();

        ArrayList<KlantType> klantTypes = new ArrayList<KlantType>();
        klantTypes.add(new KlantType("Bedrijf", 90));
        klantTypes.add(new KlantType("Extra", 20));
        klantTypes.add(new KlantType("Particulier", 30));
        Scheepsbouwer richard = new Scheepsbouwer("Richard", "admin", klantTypes);


        ArrayList<EssentieleOptie> essentieleOpties = new ArrayList<>();
        ArrayList<ExtraOptie> extraOpties = new ArrayList<>();
        essentieleOpties.add(new EssentieleOptie("Motor", "Draait boot", 1999.99));
        essentieleOpties.add(new EssentieleOptie("energievoorzieningen", "Licht geven", 20));
        essentieleOpties.add(new EssentieleOptie("Scheepsromp", "Geeft structuur aan het schip", 20));
        essentieleOpties.add(new EssentieleOptie("Diesel", "Geeft energie", 20));
        extraOpties.add(new ExtraOptie("sea-wiz", "Anti air defense system", 20));
        extraOpties.add(new ExtraOptie("TurretKogels", "Kogels om te kunnen schieten", 20));
        extraOpties.add(new ExtraOptie("Torpedos", "Onderwater Raketten", 20));


        Welkom.welkomScreen(klantTypes, essentieleOpties, extraOpties, sc, richard);

    }


    public static void selecteerOpties(Offerte offerte, ArrayList<EssentieleOptie> essentieleOpties, ArrayList<ExtraOptie> extraOpties, Scanner sc){
        System.out.println("Selecteer jouw optie");
        int keuze = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();

            for (int i = 0; i < essentieleOpties.size(); i++) {
                System.out.println((i) + ": " + essentieleOpties.get(i).getEssentieleOptie() + " (€" + essentieleOpties.get(i).getKostenEssentieleOptie() + ")");
            }
            for (int i = 0; i < extraOpties.size(); i++) {
                System.out.println((i + essentieleOpties.size() + 1) + ": " + extraOpties.get(i).getExtraOptie() + " (€" + extraOpties.get(i).getKostenExtraOptie() + ")");
            }
            if (keuze > essentieleOpties.size()) {
                a.add(keuze - 1);
                System.out.println("Je hebt " + extraOpties.get(keuze - 1 - essentieleOpties.size()).getExtraOptie() + "gekozen");
            }
            else if (keuze < essentieleOpties.size() + 1) {
                a.add(keuze - 1);
                System.out.println("Je hebt " + essentieleOpties.get(keuze - 1).getEssentieleOptie() + " gekozen");
            } else if (keuze > essentieleOpties.size() & keuze < essentieleOpties.size() + extraOpties.size() + 1) {
                a.add(keuze - 1);
                System.out.println("Je hebt " + extraOpties.get(keuze - 1 - essentieleOpties.size()).getExtraOptie() + " gekozen");
            }
            else if (keuze >= essentieleOpties.size() + extraOpties.size()) {
                System.out.println("Ongeldige keuze");
                selecteerOpties(offerte, essentieleOpties, extraOpties, sc);
            }

            System.out.println("Je hebt de volgende optie gekozen:");

            for (int optie : a) {
                if (optie < essentieleOpties.size()) {
                    EssentieleOptie gekozenOptie = essentieleOpties.get(optie);
                    System.out.println("- " + gekozenOptie.getEssentieleOptie() + " (€" + gekozenOptie.getKostenEssentieleOptie() + ")");
                    offerte.addGekozenEssentieleOpties(essentieleOpties.get(optie));
                    System.out.println("----------------------------------------------------------");
                } else {
                    ExtraOptie gekozenOptie = extraOpties.get(optie - essentieleOpties.size());
                    System.out.println("- " + gekozenOptie.getExtraOptie() + " (€" + gekozenOptie.getKostenExtraOptie() + ")");
                    offerte.addGekozenExtraOpties(extraOpties.get(optie - essentieleOpties.size()));
                    System.out.println("----------------------------------------------------------");
                }
            }

        System.out.println("Heb je alles geselecteerd?");
        System.out.println("1: ja");
        System.out.println("2: nee");


        int keuze2 = sc.nextInt();
        if(keuze2 == 1){
            System.out.println("Keuze voltooid");
            offerte.printGekozenOpties();
            offerte.berekenTotaalPrijs();
        }
        else if ( keuze2 == 2) {
            selecteerOpties(offerte, essentieleOpties, extraOpties, sc);
        }
    }

}
