import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main (String[]args){
        //------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
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

        ArrayList<KlantType> klantTypes = new ArrayList<KlantType>();
        klantTypes.add(new KlantType("Bedrijf", 90));
        klantTypes.add(new KlantType("Extra", 20));
        klantTypes.add(new KlantType("Particulier", 30));
    }
    public void gegevensInvullen(ArrayList<KlantType> klantTypes){
        Scanner sc = new Scanner(System.in);
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
        Gebruiker klant = new Klant(naam,email,adres,telefoonnr,klantTypes.get(keuze+1));
        //vul hieronder de toon optie lijst methode.
        // toonOptieLijst(parameters);
    }

}
