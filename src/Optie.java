import java.util.ArrayList;
import java.util.Scanner;

class Optie {
        private String omschrijvingOptie;

        public Optie(String omschrijvingOptie) {
            this.omschrijvingOptie = omschrijvingOptie;
        }

        public String getOmschrijvingOptie() {
            return omschrijvingOptie;
        }

        public void setOmschrijvingOptie(String omschrijvingOptie) {
            this.omschrijvingOptie = omschrijvingOptie;
        }


    // Methode om de lijst met opties uit te printen, essentieel en extra
        public static void lijstOpties(ArrayList<EssentieleOptie> essentieleOpties, ArrayList<ExtraOptie> extraOpties, Scanner sc) {
        System.out.println("Optie lijst:");
        System.out.println("essentiele opties:");

        for (EssentieleOptie essentieleOptie : essentieleOpties) {
            System.out.println("- " + essentieleOptie.getEssentieleOptie() + ": " + essentieleOptie.getOmschrijvingOptie() + " (€" + essentieleOptie.getKostenEssentieleOptie() + ")");
        }
        System.out.println("extra opties:");

        for (ExtraOptie extraOptie : extraOpties) {
            System.out.println("- " + extraOptie.getExtraOptie() + ": " + extraOptie.getOmschrijvingOptie() + " (€" + extraOptie.getKostenExtraOptie() + ")");
        }
        System.out.println("Wat wilt u doen?");
        System.out.println("1: optie toevoegen");
        System.out.println("2: optie verwijderen");
        System.out.println("0: terug");
    }

    // Methode zodat de scheepsbouwer opties kan toevoegen, deze moet de gegevens opvragen en kunnen overnemen die de maker geeft
    public static void optieToevoegen(ArrayList<EssentieleOptie> essentieleOpties, ArrayList<ExtraOptie> extraOpties, Scanner sc, Scheepsbouwer richard, ArrayList<KlantType> klantType)
    {
        System.out.println("1: essentiele optie toevoegen");
        System.out.println("2: extra optie toevoegen");

        int choice = sc.nextInt();
        sc.nextLine();

        if (choice == 1){
            System.out.println("welke essentiele optie wilt u toevoegen?");
            System.out.println("naam essentiele optie: ");
            String naam;
            naam = sc.nextLine();

            System.out.println("beschrijving essentiele optie: ");
            String beschrijving;
            beschrijving = sc.nextLine();

            System.out.println("prijs essentiele optie: ");
            double prijs;
            prijs = sc.nextDouble();
            sc.nextLine();
            System.out.println("Nieuwe optielijst:");

            essentieleOpties.add(new EssentieleOptie(naam, beschrijving, prijs));
            for ( EssentieleOptie essentieleOptie : essentieleOpties){
                System.out.println("- " + essentieleOptie.getEssentieleOptie() + ": " + essentieleOptie.getOmschrijvingOptie() + " (€" + essentieleOptie.getKostenEssentieleOptie() + ")");
            }
            for ( ExtraOptie extraOptie : extraOpties){
                System.out.println("- " + extraOptie.getExtraOptie() + ": " + extraOptie.getOmschrijvingOptie() + " (€" + extraOptie.getKostenExtraOptie() + ")");
            }
            Scheepsbouwer.scheepsBouwer(klantType, essentieleOpties, extraOpties, sc, richard);

        }

        if (choice == 2){
            System.out.println("welke extra optie wilt u toevoegen?");
            System.out.println("naam extra optie: ");
            String naam;
            naam = sc.nextLine();

            System.out.println("beschrijving extra optie: ");
            String beschrijving;
            beschrijving = sc.nextLine();

            System.out.println("prijs extra optie: ");
            double prijs;
            prijs = sc.nextDouble();
            sc.nextLine();
            System.out.println("Nieuwe optielijst:");

            extraOpties.add(new ExtraOptie(naam, beschrijving, prijs));
            for ( EssentieleOptie essentieleOptie : essentieleOpties){
                System.out.println("- " + essentieleOptie.getEssentieleOptie() + " (" + essentieleOptie.getOmschrijvingOptie() + ")" + " (€" + essentieleOptie.getKostenEssentieleOptie() + ")");
            }
            for ( ExtraOptie extraOptie : extraOpties){
                System.out.println("- " + extraOptie.getExtraOptie() + " (" + extraOptie.getOmschrijvingOptie() + ")");
            }
            Scheepsbouwer.scheepsBouwer(klantType, essentieleOpties, extraOpties, sc, richard);

        }
        if (choice != 1 || choice != 2){
            System.out.println("onjuiste keuze!");
            optieToevoegen(essentieleOpties, extraOpties, sc, richard, klantType);
        }


    }
// scheepsbouwer moet opties kunnen verwijderen
    public static void optieVerwijderen(ArrayList<EssentieleOptie> essentieleOpties, ArrayList<ExtraOptie> extraOpties, Scanner sc, Scheepsbouwer richard, ArrayList<KlantType> klantType){
        System.out.println("1: essentiele optie verwijderen");
        System.out.println("2: extra optie verwijderen");

        int choice = sc.nextInt();
        sc.nextLine();

        if (choice == 1){
            System.out.println("welke essentiele optie wilt u verwijderen?");
            choice = sc.nextInt();
            sc.nextLine();

            essentieleOpties.remove(choice-1);

            for ( EssentieleOptie essentieleOptie : essentieleOpties){
                System.out.println("- " + essentieleOptie.getEssentieleOptie() + ": " + essentieleOptie.getOmschrijvingOptie() + " (€" + essentieleOptie.getKostenEssentieleOptie() + ")");
            }
            for ( ExtraOptie extraOptie : extraOpties){
                System.out.println("- " + extraOptie.getExtraOptie() + ": " + extraOptie.getOmschrijvingOptie() + " (€" + extraOptie.getKostenExtraOptie() + ")");
            }
            Scheepsbouwer.scheepsBouwer(klantType, essentieleOpties, extraOpties, sc, richard);

        }

        if (choice == 2){
            System.out.println("welke extra optie wilt u verwijderen?");
            choice = sc.nextInt();
            sc.nextLine();

            extraOpties.remove(choice-1);

            for ( EssentieleOptie essentieleOptie : essentieleOpties){
                System.out.println("- " + essentieleOptie.getEssentieleOptie() + ": " + essentieleOptie.getOmschrijvingOptie() + " (€" + essentieleOptie.getKostenEssentieleOptie() + ")");
            }
            for ( ExtraOptie extraOptie : extraOpties){
                System.out.println("- " + extraOptie.getExtraOptie() + ": " + extraOptie.getOmschrijvingOptie() + " (€" + extraOptie.getKostenExtraOptie() + ")");
            }
            Scheepsbouwer.scheepsBouwer(klantType, essentieleOpties, extraOpties, sc, richard);

        }
        if (choice != 1 || choice != 2){
            System.out.println("onjuiste keuze!");
            Optie.optieToevoegen(essentieleOpties, extraOpties, sc, richard, klantType);
        }
    }
    }

