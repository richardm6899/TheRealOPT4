import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        //ik heb de ascii art verplaatst.
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
        extraOpties.add(new ExtraOptie("sea-wiz", "Anti air defense systeem", 20));
        extraOpties.add(new ExtraOptie("TurretKogels", "Kogels om te kunnen schieten", 20));
        extraOpties.add(new ExtraOptie("Torpedos", "Schippen te kunnen schieten", 20));


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

        System.out.println("Heb je alles selecteerd?");
        System.out.println("1: ja");
        System.out.println("2: nee");


        int keuze2 = sc.nextInt();
        if(keuze2 == 1){
            System.out.println("Keuze voltooid");
        } else if (keuze2 == 2) {
            selecteerOpties(essentieleOpties, extraOpties, sc);
        }
    }

    public static void logoPage() {
        System.out.println(" ________  ________  ___  ___  _______   _______   ________  ________           ________  ________  ___  ___  ___       __   _______   ________     \n" +
                "|\\   ____\\|\\   ____\\|\\  \\|\\  \\|\\  ___ \\ |\\  ___ \\ |\\   __  \\|\\   ____\\         |\\   __  \\|\\   __  \\|\\  \\|\\  \\|\\  \\     |\\  \\|\\  ___ \\ |\\   __  \\    \n" +
                "\\ \\  \\___|\\ \\  \\___|\\ \\  \\\\\\  \\ \\   __/|\\ \\   __/|\\ \\  \\|\\  \\ \\  \\___|_        \\ \\  \\|\\ /\\ \\  \\|\\  \\ \\  \\\\\\  \\ \\  \\    \\ \\  \\ \\   __/|\\ \\  \\|\\  \\   \n" +
                " \\ \\_____  \\ \\  \\    \\ \\   __  \\ \\  \\_|/_\\ \\  \\_|/_\\ \\   ____\\ \\_____  \\        \\ \\   __  \\ \\  \\\\\\  \\ \\  \\\\\\  \\ \\  \\  __\\ \\  \\ \\  \\_|/_\\ \\   _  _\\  \n" +
                "  \\|____|\\  \\ \\  \\____\\ \\  \\ \\  \\ \\  \\_|\\ \\ \\  \\_|\\ \\ \\  \\___|\\|____|\\  \\        \\ \\  \\|\\  \\ \\  \\\\\\  \\ \\  \\\\\\  \\ \\  \\|\\__\\_\\  \\ \\  \\_|\\ \\ \\  \\\\  \\| \n" +
                "    ____\\_\\  \\ \\_______\\ \\__\\ \\__\\ \\_______\\ \\_______\\ \\__\\     ____\\_\\  \\        \\ \\_______\\ \\_______\\ \\_______\\ \\____________\\ \\_______\\ \\__\\\\ _\\ \n" +
                "   |\\_________\\|_______|\\|__|\\|__|\\|_______|\\|_______|\\|__|    |\\_________\\        \\|_______|\\|_______|\\|_______|\\|____________|\\|_______|\\|__|\\|__|\n" +
                "   \\|_________|                                                \\|_________|                                                                         \n" +
                "                                                                                                                                                    \n" +
                "                                                                                                                                                    ");
    }

    //basis van de welkom en login.
    public static void welkomScreen(ArrayList<KlantType> klantTypes, ArrayList<EssentieleOptie> essentieleOpties, ArrayList<ExtraOptie> extraOpties, Scanner sc, Scheepsbouwer richard) {
        System.out.println("Welkom!, Welke rol heeft u.");
        System.out.println("Rollen: ");
        System.out.println("Toets 1 voor scheeps bouwer.");
        System.out.println("Toets 2 voor klant");
        System.out.println("----------------------------------------------------------");
        System.out.println();


        int input = sc.nextInt();
        sc.nextLine();

        if (input == 1) {
            loginScreen(klantTypes, essentieleOpties, extraOpties, sc, richard);

        } else if (input == 2) {
            gegevensInvullen(klantTypes, essentieleOpties, extraOpties, sc);

        } else {
            welkomScreen(klantTypes, essentieleOpties, extraOpties, sc, richard);
        }

    }

    //basis van de welkom en log in (gaat nog veranderen).
    public static void loginScreen(ArrayList<KlantType> klantTypes, ArrayList<EssentieleOptie> essentieleOpties, ArrayList<ExtraOptie> extraOpties, Scanner sc, Scheepsbouwer richard) {
        System.out.println("Welkom scheepsbouwer ! Log a.u.b hier in.");

        String input = sc.nextLine();
        if (input.equals(richard.getWachtwoord()))
        {
            System.out.println("----------------------------------------------------------");
            System.out.println();
            scheepsBouwer(klantTypes, essentieleOpties, extraOpties, sc, richard);

        }
        else
        {
            System.out.println("Wachtwoord is onjuist!");
            loginScreen(klantTypes, essentieleOpties, extraOpties, sc, richard);
        }
    }

    public static void lijstKlantType(ArrayList<KlantType> klantTypes, Scanner sc) {
        for (KlantType klanttype : klantTypes) {
            System.out.println("-" + klanttype.getKlanttype());
        }
        System.out.println("Wat wilt u doen?");
        System.out.println("1: klanttype toevoegen");
        System.out.println("2: klanttype verwijderen");
        System.out.println("0: terug");
    }

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
        System.out.println("----------------------------------------------------------");
        System.out.println();
        System.out.println("Wat wilt u doen?");
        System.out.println("1: optie toevoegen");
        System.out.println("2: optie verwijderen");
        System.out.println("0: terug");
    }
    public static void scheepsBouwer(ArrayList<KlantType> klantTypes, ArrayList<EssentieleOptie> essentieleOpties, ArrayList<ExtraOptie> extraOpties, Scanner sc, Scheepsbouwer richard){
        System.out.println("Welke Lijst wilt u weergeven?");
        System.out.println("1: KlantType lijst");
        System.out.println("2: Optie lijst (essentiel en extra)");
        System.out.println("0: Terug naar Menu");
        int choice = sc.nextInt();
        sc.nextLine();
        System.out.println("----------------------------------------------------------");
        System.out.println();

        if (choice == 1) {
            lijstKlantType(klantTypes, sc);
            choice = sc.nextInt();
            sc.nextLine();
            System.out.println("----------------------------------------------------------");
            System.out.println();

            if (choice == 1) {
                klantTypeToevoegen(essentieleOpties, extraOpties, sc, richard, klantTypes);
            }

            if (choice == 2) {

            }
            if (choice == 0) {
                scheepsBouwer(klantTypes, essentieleOpties, extraOpties, sc, richard);
            }
        }


        if (choice == 2) {
            lijstOpties(essentieleOpties, extraOpties, sc);
            System.out.println("----------------------------------------------------------");
            System.out.println();
            choice = sc.nextInt();
            sc.nextLine();
            if (choice == 1){
                optieToevoegen(essentieleOpties, extraOpties, sc, richard, klantTypes);

            }
            if (choice == 2){
                optieVerwijderen(essentieleOpties, extraOpties, sc, richard, klantTypes);

            }
            if (choice == 0){
                scheepsBouwer(klantTypes, essentieleOpties, extraOpties, sc, richard);
            }
        }
        if (choice == 0) {
            welkomScreen(klantTypes, essentieleOpties, extraOpties, sc, richard);
            offerte.printGekozenOpties();
            offerte.berekenTotaalPrijs();
        }
        else if ( keuze2 == 2) {
            selecteerOpties(offerte, essentieleOpties, extraOpties, sc);
        }
    }
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
            System.out.println("----------------------------------------------------------");
            System.out.println();
            System.out.println("Nieuwe optielijst:");

            essentieleOpties.add(new EssentieleOptie(naam, beschrijving, prijs));
            for ( EssentieleOptie essentieleOptie : essentieleOpties){
                System.out.println("- " + essentieleOptie.getEssentieleOptie() + ": " + essentieleOptie.getOmschrijvingOptie() + " (€" + essentieleOptie.getKostenEssentieleOptie() + ")");
            }
            for ( ExtraOptie extraOptie : extraOpties){
                System.out.println("- " + extraOptie.getExtraOptie() + ": " + extraOptie.getOmschrijvingOptie() + " (€" + extraOptie.getKostenExtraOptie() + ")");
            }
            System.out.println("----------------------------------------------------------");
            System.out.println();
            scheepsBouwer(klantType, essentieleOpties, extraOpties, sc, richard);

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
            System.out.println("----------------------------------------------------------");
            System.out.println();
            System.out.println("Nieuwe optielijst:");

            extraOpties.add(new ExtraOptie(naam, beschrijving, prijs));
            for ( EssentieleOptie essentieleOptie : essentieleOpties){
                System.out.println("- " + essentieleOptie.getEssentieleOptie() + " (" + essentieleOptie.getOmschrijvingOptie() + ")" + " (€" + essentieleOptie.getKostenEssentieleOptie() + ")");
            }
            for ( ExtraOptie extraOptie : extraOpties){
                System.out.println("- " + extraOptie.getExtraOptie() + ": " + extraOptie.getOmschrijvingOptie() + " (€" + extraOptie.getKostenExtraOptie() + ")");
            }
            System.out.println("----------------------------------------------------------");
            System.out.println();
            scheepsBouwer(klantType, essentieleOpties, extraOpties, sc, richard);

        }
        if (choice != 1 || choice != 2){
            System.out.println("onjuiste keuze!");
            optieToevoegen(essentieleOpties, extraOpties, sc, richard, klantType);
        }
    }
    public static void klantTypeToevoegen(ArrayList<EssentieleOptie> essentieleOpties, ArrayList<ExtraOptie> extraOpties, Scanner sc, Scheepsbouwer richard, ArrayList<KlantType> klantType){
        System.out.println("welke klanttype wilt u toevoegen?");
        System.out.println("naam klanttype: ");
        String naam;
        naam = sc.nextLine();

        System.out.println("kortingspercentage klanttype: ");
        int korting;
        korting = sc.nextInt();
        sc.nextLine();
        System.out.println("----------------------------------------------------------");
        System.out.println();
        System.out.println("Nieuwe klanttype lijst:");
        klantType.add(new KlantType(naam, korting));

        for(KlantType klantTypes : klantType){
            System.out.println ("- " +klantTypes.getKlanttype() + "(" + klantTypes.getKortingsPercentage() + ")");
        }
        System.out.println("----------------------------------------------------------");
        System.out.println();
        scheepsBouwer(klantType, essentieleOpties, extraOpties, sc, richard);
    }

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
            scheepsBouwer(klantType, essentieleOpties, extraOpties, sc, richard);

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
            scheepsBouwer(klantType, essentieleOpties, extraOpties, sc, richard);

        }
        if (choice != 1 || choice != 2){
            System.out.println("onjuiste keuze!");
            optieToevoegen(essentieleOpties, extraOpties, sc, richard, klantType);
        }
    }
    public void klantTypeVerwijderen(ArrayList<EssentieleOptie> essentieleOpties, ArrayList<ExtraOptie> extraOpties, Scanner sc, Scheepsbouwer richard, ArrayList<KlantType> klantType){
        System.out.println("welke klanttype wilt u verwijderen?");
        int choice = sc.nextInt();
        sc.nextLine();
        klantType.remove(choice - 1);

        System.out.println("Nieuwe klanttype lijst:");

        for(KlantType klantTypes : klantType){
            System.out.println ("- " +klantTypes.getKlanttype() + "(" + klantTypes.getKortingsPercentage() + ")");
        }
        System.out.println("----------------------------------------------------------");
        System.out.println();
        scheepsBouwer(klantType, essentieleOpties, extraOpties, sc, richard);

    }
}
