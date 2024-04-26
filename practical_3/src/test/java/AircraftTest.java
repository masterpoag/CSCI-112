import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AircraftTest {

    @Test
    void testEmptyConstructor(){
        Aircraft craft = new Aircraft();
        assertNotNull(craft);
    }

    @Test
    void testNonEmptyConstructor(){
        Aircraft craft = new Aircraft("Mil", "jet", 100.00);
        assertAll("Testing the non-empty constructor",
                () -> assertEquals("Mil", craft.getCraftType()),
                () -> assertEquals("jet", craft.getPropulsionType()),
                () -> assertEquals(100.00, craft.getCraftCost())
        );
    }

    @Test
    void setCraftType() {
        Aircraft craft = new Aircraft();
        craft.setCraftType("Mil");
        assertEquals("Mil", craft.getCraftType());
    }

    @Test
    void setPropulsionType() {
        Aircraft craft = new Aircraft();
        craft.setPropulsionType("jet");
        assertEquals("jet", craft.getPropulsionType());
    }

    @Test
    void setCraftCost() {
        Aircraft craft = new Aircraft();
        craft.setCraftCost(200.00);
        assertEquals(200.00, craft.getCraftCost());
    }

    @Test
    void testToString() {
        Aircraft craft = new Aircraft("Mil", "jet", 100.00);
        assertEquals("This Mil aircraft uses jet propulsion and costs $100.00", craft.toString());
    }
}