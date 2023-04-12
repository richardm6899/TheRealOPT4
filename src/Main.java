import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //ik heb de ascii art verplaatst.
        beginPage();

        ArrayList<KlantType> klantTypes = new ArrayList<KlantType>();
        klantTypes.add(new KlantType("Bedrijf", 90));
        klantTypes.add(new KlantType("Extra", 20));
        klantTypes.add(new KlantType("Particulier", 30));

        ArrayList<EssentieleOptie> essentieleOpties = new ArrayList<>();
        ArrayList<ExtraOptie> extraOpties = new ArrayList<>();

        essentieleOpties.add(new EssentieleOptie("Motor", "Draait boot"));
        essentieleOpties.add(new EssentieleOptie("energievoorzieningen", "Licht geven"));
        essentieleOpties.add(new EssentieleOptie( "Scheepsromp", "Geeft structuur aan het schip")) ;
        essentieleOpties.add(new EssentieleOptie("Diesel", "Geeft energie"));
        extraOpties.add(new ExtraOptie("sea-wiz", "Anti air defense systeem"));
        extraOpties.add(new ExtraOptie("TurretKogels", "Kogels om te kunnen schieten"));
        extraOpties.add(new ExtraOptie("Torpedos", "Schippen te kunnen schieten"));
        gegevensInvullen(klantTypes, essentieleOpties, extraOpties, sc);



        //Gebruiker richard = new Klant("Richard", "Motor", "AK47");
        //richard.printOptieLijst("Motor");
    }
    public static void gegevensInvullen(ArrayList<KlantType> klantTypes, ArrayList<EssentieleOptie> essentieleOpties, ArrayList<ExtraOptie> extraOpties, Scanner sc){
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
        klantTypes.forEach((n)->System.out.printf("%d: %s%n",klantTypes.indexOf(n)+1,n.getKlanttype()));
        int keuze = sc.nextInt();
        //maakt het klant object aan.
        Gebruiker klant = new Klant(naam, essentieleOpties, extraOpties, email, adres, telefoonnr, klantTypes.get(keuze-1));
        klant.printOptieLijst(essentieleOpties, extraOpties);
        selecteerOpties(essentieleOpties, extraOpties, sc);
        //vul hieronder de toon optie lijst methode.
        // toonOptieLijst(parameters);

    }
    public static void selecteerOpties(ArrayList<EssentieleOptie> essentieleOpties, ArrayList<ExtraOptie> extraOpties, Scanner sc){

        System.out.println("Selecteer jouw optie");
        int keuze = sc.nextInt();
        if(keuze < essentieleOpties.size()) {
            System.out.println(essentieleOpties.get(keuze - 1).getEssentieleOptie());
        }
        else{
            System.out.println(extraOpties.get(keuze - 1 - essentieleOpties.size()).getExtraOptie());
        }
        System.out.println("Heb je alles selecteerd?");
        System.out.println("1: ja");
        System.out.println("2: nee");

        int keuze2 = sc.nextInt();
        if(keuze2 == 1){
            System.out.println("Keuze voltooid");
        }
        else if ( keuze2 == 2) {
            selecteerOpties(essentieleOpties, extraOpties, sc);
        }
    }

    public static void beginPage(){
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
}
