
import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import org.junit.Test;

public class OptieTest {

    @Test
    public void testGetOmschrijvingOptie() {
        Optie optie = new Optie("Testoptie");
        assertEquals("Testoptie", optie.getOmschrijvingOptie());
    }

    @Test
    public void testSetOmschrijvingOptie() {
        Optie optie = new Optie("Testoptie");
        optie.setOmschrijvingOptie("Gewijzigde testoptie");
        assertEquals("Gewijzigde testoptie", optie.getOmschrijvingOptie());
    }

}