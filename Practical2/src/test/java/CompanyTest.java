import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompanyTest {
    @Test
    void Constuctor() {
        Company test = new Company();
        assertNotNull(test);
    }
    @Test
    void setName() {
        Company test = new Company();
        test.setName("Test");
        assertEquals("Test",test.getName());
    }

    @Test
    void addStores() {
        Company test = new Company();
        test.addStores("Test");
        assertAll(
                ()-> assertNotNull(test.getStore(0)),
                ()-> assertEquals("Test",test.getStore(0).getName())
        );
    }

    @Test
    void addProductToStore() {
        Company test = new Company();
        test.addStores("Test");
        test.addProductToStore("name","about",5.0,0);
        assertAll(
                ()-> assertEquals("name",test.getStore(0).getProduct(0).getBrandName()),
                ()-> assertEquals("about",test.getStore(0).getProduct(0).getProductDescription()),
                ()-> assertEquals(5.0,test.getStore(0).getProduct(0).getCost())
        );
    }

    @Test
    void sortCompany() {
        Company test = new Company();
        test.addStores("Test");
        test.addProductToStore("name","about", 10.0,0);
        test.addProductToStore("name","about", 0.0,0);
        test.addProductToStore("name","about", 5.0,0);
        double testFor= test.getStore(0).getProduct(0).getCost();
        test.sortCompany();
        assertAll(
                () -> assertEquals(testFor,test.getStore(0).getProduct(2).getCost()),
                () -> assertEquals(0.0,test.getStore(0).getProduct(0).getCost())
        );
    }
}