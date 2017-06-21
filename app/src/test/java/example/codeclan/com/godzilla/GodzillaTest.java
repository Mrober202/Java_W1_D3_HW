package example.codeclan.com.godzilla;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class GodzillaTest {

    Godzilla godzilla;
    KingKong kingKong;

    @Before
    public void before(){
        godzilla = new Godzilla("Gary", 100);
        kingKong = new KingKong("Kong", 80);
    }

    @Test
    public void hasName(){
        assertEquals("Gary", godzilla.getName());
        assertEquals("Kong", kingKong.getName());
    }

    @Test
    public void canRoar(){
        assertEquals("Where the Godzillitas at?!", godzilla.roar());
        assertEquals("OO OO AA AA", kingKong.roar());
    }

    @Test
    public void canGetHealthValue(){
        assertEquals(godzilla.getHealthValue(), 100);
        assertEquals(kingKong.getHealthValue(), 80);
    }

    @Test
    public void canGetDestructiveForce(){
        assertEquals(godzilla.getDestructiveForce(), 200);
        assertEquals(kingKong.getDestructiveForce(), 100);
    }
}
