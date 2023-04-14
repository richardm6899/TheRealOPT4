import java.util.ArrayList;
import java.util.Scanner;

public class KlantType extends MilieuKorting{
    private String klanttype;


    public KlantType(String klanttype, int kortingpercentage) {
        super(kortingpercentage);
        this.klanttype= klanttype;
    }

    public String getKlanttype() {

        return klanttype;
    }

    public void setKlanttype(String klanttype) {

        this.klanttype = klanttype;
    }

    public static void lijstKlantType(ArrayList<KlantType> klantTypes, Scanner sc) {
        for (KlantType klanttype : klantTypes) {
            System.out.println("-" + klanttype.getKlanttype());
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
        Scheepsbouwer.scheepsBouwer(klantType, essentieleOpties, extraOpties, sc, richard);
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
        Scheepsbouwer.scheepsBouwer(klantType, essentieleOpties, extraOpties, sc, richard);

    }
}

