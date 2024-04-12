import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BarTest {
    @Test
    void nullContructor() {
        Bar bar = new Bar();
        assertNotNull(bar);
    }
    @Test
    void nonnullContructor() {
        Bar bar = new Bar("Name");
        assertAll(
                ()-> assertNotNull(bar),
                ()-> assertEquals("Name",bar.getName())
        );
    }
    @Test
    void addDrinkToArray() {
        Bar bar = new Bar();
        bar.addDrinkToArray("Elk Cove", "Pinot Noir", 8.00);
        assertAll(
                ()-> assertNotNull(bar.getDrink(0)),
                ()-> assertEquals(1,bar.getCount())
        );

    }
    @Test
    void average() {
        Bar bar = new Bar();
        bar.addDrinkToArray("Elk Cove", "Pinot Noir", 8.00);
        bar.addDrinkToArray("Elk Cove", "Pinot Noir", 4.00);
        assertEquals((8.00+4.00)/2,bar.getAvg());
    }
    @Test
    void Lowest(){
        Bar bar = new Bar();
        bar.addDrinkToArray("Elk Cove", "Pinot Noir", 8.00);
        bar.addDrinkToArray("Elk Cove", "Pinot Noir", 4.00);
        assertEquals(bar.getDrink(1).toString(),bar.getLeast());
    }

}