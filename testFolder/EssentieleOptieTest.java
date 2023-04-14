import org.junit.Test;
import static org.junit.Assert.*;

public class EssentieleOptieTest {
    @Test
    public void testEssentieleGetter(){
        EssentieleOptie essentieleOptie = new EssentieleOptie(null, "brown");
        assertNull(null, essentieleOptie.getEssentieleOptie());
        assertEquals("brown", essentieleOptie.getOmschrijvingOptie());

    }
    @Test
    public void testEssentieleSetter(){
        EssentieleOptie essentieleOptie = new EssentieleOptie("Motor", "Draait boot");
        essentieleOptie.setEssentieleOptie("Motor x5000");
        essentieleOptie.setOmschrijvingOptie("Draait boot snel");
        assertEquals("Motor x5000", essentieleOptie.getEssentieleOptie());
        assertEquals("Draait boot snel", essentieleOptie.getOmschrijvingOptie());
    }
}

