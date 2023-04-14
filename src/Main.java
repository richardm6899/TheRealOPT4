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
        essentieleOpties.add(new EssentieleOptie( "Diesel", "Geeft energie", 20));
        extraOpties.add(new ExtraOptie("sea-wiz", "Anti air defense systeem", 20));
        extraOpties.add(new ExtraOptie("TurretKogels", "Kogels om te kunnen schieten", 20));
        extraOpties.add(new ExtraOptie("Torpedos", "Schippen te kunnen schieten", 20));


        Welkom.welkomScreen(klantTypes, essentieleOpties, extraOpties, sc, richard);

    }
}
