import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class cargoTest {

    @Test
    void constructor(){
        cargo s = new cargo("Mil", "jet", 100.00);
        assertAll(
                () -> assertEquals("Mil", s.getCraftType()),
                () -> assertEquals("jet", s.getPropulsionType()),
                () -> assertEquals(100.00, s.getCraftCost()),
                () -> assertEquals(0, s.getMaxWeight()),
                () -> assertEquals(0, s.getStorageSpace()),
                () -> assertEquals(0, s.getMaxSpeed())
        );
    }
    @Test
    void constructor2(){
        cargo s = new cargo("Mil", "jet", 100.00,1,2,3);
        assertAll(
                () -> assertEquals("Mil", s.getCraftType()),
                () -> assertEquals("jet", s.getPropulsionType()),
                () -> assertEquals(100.00, s.getCraftCost()),
                () -> assertEquals(2, s.getMaxWeight()),
                () -> assertEquals(1, s.getStorageSpace()),
                () -> assertEquals(3, s.getMaxSpeed())
        );

    }
    @Test
    void setStorageSpace() {
        cargo s = new cargo("Mil", "jet", 100.00,1,2,3);
        s.setStorageSpace(5);
        assertEquals(s.getStorageSpace(),5);
    }

    @Test
    void setMaxWeight() {
        cargo s = new cargo("Mil", "jet", 100.00,1,2,3);
        s.setMaxWeight(5);
        assertEquals(s.getMaxWeight(),5);
    }

    @Test
    void setMaxSpeed() {
        cargo s = new cargo("Mil", "jet", 100.00,1,2,3);
        s.setMaxSpeed(5);
        assertEquals(s.getMaxSpeed(),5);
    }

    @Test
    void testToString() {
        cargo s = new cargo("Mil", "jet", 100.00,1,2,3);
        assertEquals(s.toString(),"This Mil aircraft uses jet propulsion and costs $100.00"+"\n"+"cargo{" + "storageSpace=" + "1" + ", maxWeight=" + "2" + ", maxSpeed=" + "3" + '}');
    }
}