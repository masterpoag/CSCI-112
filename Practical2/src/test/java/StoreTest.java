import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StoreTest {

    @Test
    void voidConstrustor(){
        Store test = new Store();
        assertNotNull(test);
    }
    @Test
    void Construstor(){
        Store test = new Store("Test");
        assertAll(
                () -> assertNotNull(test),
                () -> assertEquals("Test",test.getName())
        );
    }

    @Test
    void setName() {
        Store test = new Store("Test");
        test.setName("notTest");
        assertEquals("notTest",test.getName());
    }
    @Test
    void addProducts() {
        Store test = new Store("Test");
        test.addProducts("name","about", 0.0);
        Products testing =  new Products("name","about", 0.0);
        assertAll(
                () -> assertEquals(test.getProduct(0).getProductDescription(),testing.getProductDescription()),
                () -> assertEquals(test.getProduct(0).getCost(),testing.getCost()),
                () -> assertEquals(test.getProduct(0).getBrandName(),testing.getBrandName())
        );
    }

    @Test
    void calcAvgCost() {
        Store test = new Store("Test");
        test.addProducts("name","about", 0.0);
        test.addProducts("name","about", 10.0);
        assertEquals(5.0,test.calcAvgCost());
    }
    @Test
    void sort(){
        Store test = new Store("Test");
        test.addProducts("name","about", 10.0);
        test.addProducts("name","about", 0.0);
        test.addProducts("name","about", 5.0);
        double testFor= test.getProduct(0).getCost();
        test.productSort();
        assertAll(
                () -> assertEquals(testFor,test.getProduct(2).getCost()),
                () -> assertEquals(0.0,test.getProduct(0).getCost())
        );
    }

}