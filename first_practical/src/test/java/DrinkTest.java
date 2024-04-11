import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class DrinkTest {

    @Test
    void nullConstrutor() {
        Drink drink = new Drink();
        assertNotNull(drink);
    }
    @Test
    void notnullConstrutor() {
        Drink drink = new Drink("test1","test2",1.23);
        assertAll(
                () -> assertNotNull(drink),
                () -> assertEquals(1.23,drink.getCost()),
                () -> assertEquals("test1",drink.getName()),
                () -> assertEquals("test2",drink.getDescription())
        );
    }


    @Test
    void setName() {
        Drink drink = new Drink();
        drink.setName("test");
        assertEquals("test",drink.getName());
    }

    @Test
    void setDescription() {
        Drink drink = new Drink();
        drink.setDescription("test2");
        assertEquals("test2",drink.getDescription());
    }

    @Test
    void setCost() {
        Drink drink = new Drink();
        drink.setCost(1.23);
        assertEquals(1.23,drink.getCost());
    }

    @Test
    void testToString() {
        Drink drink = new Drink("test","test",0.0);
        assertEquals(String.format("%s\t%s\t$%,.2f", "test", "test", 0.0),drink.toString());

    }
}