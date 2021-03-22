import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {
    WaterBottle bottle;

    @Before
    public void before() {
        bottle = new WaterBottle();
    }

    @Test
    public void hasVolume(){
        assertEquals(100, bottle.getVolume());
    }

    @Test
    public void takeSip() {
        bottle.drinkWater();
        assertEquals(90, bottle.getVolume());
    }

    @Test
    public void canEmptyBottle() {
        bottle.emptyBottle();
        assertEquals(0, bottle.getVolume());
    }

    @Test
    public void fillUpBottle() {
        bottle.emptyBottle();
        bottle.fillBottle();
        assertEquals(100, bottle.getVolume());
    }
}
