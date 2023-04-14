import org.junit.Test;
import static org.junit.Assert.*;

public class KlantTest {

    @Test
    public void testConstructorEnGetters() {
        Klant klant = new Klant("Jan", "jan@test.com", "Kerkstraat 1", 123456789);
        assertEquals("Jan", klant.getNaam());
        assertEquals("jan@test.com", klant.getEmail());
        assertEquals("Kerkstraat 1", klant.getAdres());
        assertEquals(123456789, klant.getTelefoonnummer());
    }

    @Test
    public void testSetters() {
        Klant klant = new Klant("Piet", "piet@test.com", "Dorpstraat 10", 987654321);
        klant.setNaam("Klaas");
        klant.setEmail("klaas@test.com");
        klant.setAdres("Stationsweg 5");
        klant.setTelefoonnummer(456789012);
        assertEquals("Klaas", klant.getNaam());
        assertEquals("klaas@test.com", klant.getEmail());
        assertEquals("Stationsweg 5", klant.getAdres());
        assertEquals(456789012, klant.getTelefoonnummer());
    }
}