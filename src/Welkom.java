import java.util.ArrayList;
import java.util.Scanner;

public class Welkom {
    //logo voor aesthetic
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

    //welkom screen je krijgt de keuze tussen klant en scheepsbouwer om toegang tot de applicatie te krijgen.
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
            Gebruiker.gegevensInvullen(klantTypes, essentieleOpties, extraOpties, sc);

        } else {
            welkomScreen(klantTypes, essentieleOpties, extraOpties, sc, richard);
        }

    }

    //Login screen je krijgt een prompt om in te loggen als scheepsbouwer.
    public static void loginScreen(ArrayList<KlantType> klantTypes, ArrayList<EssentieleOptie> essentieleOpties, ArrayList<ExtraOptie> extraOpties, Scanner sc, Scheepsbouwer richard) {
        System.out.println("Welkom scheepsbouwer ! Log a.u.b hier in.");

        String input = sc.nextLine();
        if (input.equals(richard.getWachtwoord()))
        {
            Scheepsbouwer.scheepsBouwer(klantTypes, essentieleOpties, extraOpties, sc, richard);
        }
        else
        {
            System.out.println("Wachtwoord is onjuist!");
            loginScreen(klantTypes, essentieleOpties, extraOpties, sc, richard);
        }
    }

}
