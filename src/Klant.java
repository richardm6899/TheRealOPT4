import java.util.ArrayList;

public class Klant extends Gebruiker
{
    private String adres;
    private String email;
    private int telefoonnummer;
    private Offerte offerte;
    private KlantType klantType;

    public Klant(String naam, ArrayList<EssentieleOptie> essentieleOpties, ArrayList<ExtraOptie> extraOpties, String adres, String email, int telefoonnummer, Offerte offerte, KlantType klantType) {
        super(naam, essentieleOpties, extraOpties);
        this.email = email;
        this.adres = adres;
        this.telefoonnummer = telefoonnummer;
        this.offerte = offerte;
        this.klantType = klantType;
    }

    public Klant(String naam, ArrayList<EssentieleOptie> essentieleOpties, ArrayList<ExtraOptie> extraOpties, String adres, String email, int telefoonnummer, KlantType klantType){
        super(naam, essentieleOpties, extraOpties);
        this.email = email;
        this.adres = adres;
        this.telefoonnummer = telefoonnummer;
        this.klantType = klantType;
    }
    public Klant(String naam, String email, String adres, int telefoonnummer){
        super(naam);
        this.email = email;
        this.adres = adres;
        this.telefoonnummer = telefoonnummer;


    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        adres = adres;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefoonnummer() {
        return telefoonnummer;
    }

    public void setTelefoonnummer(int telefoonnummer) {
        this.telefoonnummer = telefoonnummer;
    }

    public Offerte getOfferte() {
        return offerte;
    }

    public void setOfferte(Offerte offerte) {
        this.offerte = offerte;
    }

    public KlantType getKlantType() {
        return klantType;
    }

    public void setKlantType(KlantType klantType) {
        this.klantType = klantType;
    }
     public void printOfferte(ArrayList<EssentieleOptie>essentieleOpties, ArrayList<ExtraOptie>extraOptie, KlantType klantType){

        // print eerst de totale prijs van de optie
         // bereken dan de korting die bij klanttype hoort
         //dan btw erover heen
         // layout:
         //         Essentiele Opties:
         //         - Zeil...................500 euro
         //         ExtraOpties:
         //         - Poedercoat.............200 euro
         //         subtotaal:...............700 euro
         //         Klantkorting:............70 euro (10%)
         //         ______________________________________
         //         totaal (20% btw):........762,30 euro

     }

}
