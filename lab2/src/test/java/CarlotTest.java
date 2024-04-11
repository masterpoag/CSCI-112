import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarlotTest {

    @Test
    void emptyConstructor(){
        Carlot test = new Carlot();
        assertNotNull(test);
    }
    @Test
    void nonEmptyConstructor(){
        Carlot test = new Carlot("Test");
        assertAll("",
                () -> assertNotNull(test),
                () -> assertEquals("Test",test.getLotName())
    );
    }

    @Test
    void setLotName() {
        Carlot test = new Carlot();
        test.setLotName("Test");
        assertEquals("Test",test.getLotName());
    }

    @Test
    void addVehicle() {
        Carlot test = new Carlot();
        test.addVehicle("Make","Model","Color",1.99);
        assertAll("",
                () -> assertEquals(1,test.getLogicalLength()),
                () ->assertNotNull(test.getIndexofArray(0)));
    }

    @Test
    void calcAverageCost() {
        Carlot test = new Carlot();
        test.addVehicle("Make","Model","Color",1.99);
        test.addVehicle("Make","Model","Color",5);
        assertEquals(((1.99+5)/2),test.calcAverageCost());
    }
}