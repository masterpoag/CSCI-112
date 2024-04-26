import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoeingTest {

    @Test
    void constructor(){
        Boeing s = new Boeing("Mil", "jet", 100.00,1,2,3);
        assertAll(
                () -> assertEquals("Mil", s.getCraftType()),
                () -> assertEquals("jet", s.getPropulsionType()),
                () -> assertEquals(100.00, s.getCraftCost()),
                () -> assertEquals(2, s.getMaxWeight()),
                () -> assertEquals(1, s.getStorageSpace()),
                () -> assertEquals(3, s.getMaxSpeed()),
                () -> assertEquals("", s.getModel()),
                () -> assertEquals("", s.getCargoType()),
                () -> assertEquals(0, s.getBuildNumber())
        );
    }
    // String propulsionType,int cost,String model,String cargoType,int buildNumber
    @Test
    void construstor2() {
        Boeing s = new Boeing( "jet", 1,"771","box",3);
        assertAll(
                () -> assertEquals("commercial", s.getCraftType()),
                () -> assertEquals("jet", s.getPropulsionType()),
                () -> assertEquals(1, s.getCraftCost()),
                () -> assertEquals(0, s.getMaxWeight()),
                () -> assertEquals(0, s.getStorageSpace()),
                () -> assertEquals(0, s.getMaxSpeed()),
                () -> assertEquals("771", s.getModel()),
                () -> assertEquals("box", s.getCargoType()),
                () -> assertEquals(3, s.getBuildNumber())
        );
    }
@Test
void setmodel(){
    Boeing s = new Boeing( "jet", 1,"771","box",3);
    s.setModel("772");
    assertEquals("772",s.getModel());

}
    @Test
    void setCargoType() {
        Boeing s = new Boeing( "jet", 1,"771","box",3);
        s.setCargoType("boxes");
        assertEquals("boxes",s.getCargoType());
    }

    @Test
    void setBuildNumber() {
        Boeing s = new Boeing( "jet", 1,"771","box",3);
        s.setBuildNumber(4);
        assertEquals(4,s.getBuildNumber());
    }

    @Test
    void testToString() {
        Boeing s = new Boeing("Mil", "jet", 100.00,1,2,3);
        assertEquals("This Mil aircraft uses jet propulsion and costs $100.00"+"\n"+"cargo{" + "storageSpace=" + "1" + ", maxWeight=" + "2" + ", maxSpeed=" + "3" + '}'+"Boeing{" + "model='" + "" + '\'' + ", cargoType='" + "" + '\'' + ", buildNumber=" + "0" + '}',s.toString());
    }
}