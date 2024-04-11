import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    @Test
    void emptyContructor(){
        Vehicle test = new Vehicle();
        assertNotNull(test);
    }
    @Test
    void nonEmptyContructor(){
        Vehicle test = new Vehicle("Make", "Model","Color",1.99);
        assertAll("Non empty contructor",
                () -> assertNotNull(test),
                () -> assertEquals("Make",test.getMake()),
                () -> assertEquals("Model",test.getModel()),
                () -> assertEquals("Color",test.getColor()),
                () -> assertEquals(1.99,test.getCost())
                );
    }

    @Test
    void setMake() {
        Vehicle test = new Vehicle();
        test.setMake("Make");
        assertEquals("Make",test.getMake());
    }

    @Test
    void setModel() {
        Vehicle test = new Vehicle();
        test.setModel("Model");
        assertEquals("Model",test.getModel());
    }

    @Test
    void setColor() {
        Vehicle test = new Vehicle();
        test.setColor("Color");
        assertEquals("Color",test.getColor());
    }

    @Test
    void setCost() {
        Vehicle test = new Vehicle();
        test.setCost(1.99);
        assertEquals(1.99,test.getCost());
    }

    @Test
    void testToString() {
        Vehicle test = new Vehicle("Make", "Model","Color",1.99);
        assertEquals(String.format("Make: %-15s Model: %-10s in %s, asking price: $%,.2f", "Make", "Model", "Color", 1.99),test.toString());

    }
}