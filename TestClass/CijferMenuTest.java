import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;

public class CijferMenuTest {

    @Test
    public void testGetters() {
        CijferMenu cm = new CijferMenu("Wiskunde", 8.0, "Notitienaam", "Notitie");
        assertEquals("Wiskunde", cm.getVaknaam());
        assertEquals(8.0, cm.getCijfer(), 0.001);
    }

    @Test
    public void testCijferNotitie() {
        ArrayList<StudieMoment> studietijden = new ArrayList<>();
        ArrayList<Roosters> notitiesroosters = new ArrayList<>();
        ArrayList<CijferMenu> cijfermenus = new ArrayList<>();

        Scanner sc = new Scanner("stop");
        Gebruiker othmane = new Gebruiker("othmane", "wachtwoord");

        CijferMenu.cijferNotitie(studietijden, notitiesroosters, cijfermenus, "naam", "wachtwoord", sc, othmane);

        assertEquals(0, cijfermenus.size());
    }
}
