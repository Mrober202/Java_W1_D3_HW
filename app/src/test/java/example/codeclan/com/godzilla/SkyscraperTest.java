package example.codeclan.com.godzilla;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;



public class SkyscraperTest {
    Skyscraper skyscraper;
    Tank tank;


    @Before
    public void before(){
        skyscraper = new Skyscraper("building", 30);
        tank = new Tank("Vehicle", 50);
    }


    @Test
    public void hasType(){
        assertEquals("building", skyscraper.getType());
        assertEquals("Vehicle", tank.getType());
    }

    @Test
    public void hasHealthValue(){
        assertEquals(30, skyscraper.getHealthValue());
        assertEquals(50, tank.getHealthValue());
    }

}
