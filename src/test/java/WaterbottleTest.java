import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterbottleTest {

    Waterbottle waterbottle;

    @Before
    public void before(){
        waterbottle = new Waterbottle();
    }

    @Test
    public void volumeStartsAt100(){
        assertEquals(100, waterbottle.getVolume());
    }

    @Test
    public void drinkReducesVolumeBy10(){
        waterbottle.drink();
        assertEquals(90,waterbottle.getVolume());
    }

    @Test
    public void canEmptyBottle(){
        waterbottle.empty();
        assertEquals(0, waterbottle.getVolume());
    }

    @Test
    public void bottleCantGoBelow0(){
        waterbottle.empty();
        waterbottle.drink();
        assertEquals(0, waterbottle.getVolume());
    }

    @Test
    public void bottleCanBeFilled(){
        waterbottle.drink();
        waterbottle.fill();
        assertEquals(100, waterbottle.getVolume());
    }

}
