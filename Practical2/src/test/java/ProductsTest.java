import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductsTest {

    @Test
    void nonproducts() {
        Products test = new Products();
        assertNotNull(test);
    }
    @Test
    void products() {
        Products test = new Products("name","about",5.0);
        assertAll(
                ()-> assertEquals("name",test.getBrandName()),
                ()-> assertEquals("about",test.getProductDescription()),
                ()-> assertEquals(5.0,test.getCost())
        );
    }
    @Test
    void setBrandName() {
        Products test = new Products();
        test.setBrandName("Test");
        assertEquals("Test",test.getBrandName());
    }

    @Test
    void setProductDescription() {
        Products test = new Products();
        test.setProductDescription("Test");
        assertEquals("Test",test.getProductDescription());
    }

    @Test
    void setCost() {
        Products test = new Products();
        test.setCost(4.0);
        assertEquals(4.0,test.getCost());
    }

    @Test
    void testToString() {
        Products test = new Products("name","about",5.0);
        String testString = String.format("Product Name: %-14s Description: %-23s Cost: %-8.2f", "name","about",5.0);
        assertEquals(testString,test.toString());
    }
}