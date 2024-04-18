import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharityTest {
    @Test
    void Charity() {
        Charity t = new Charity();
        assertNotNull(t);
    }

    @Test
    void nonCharity() {
        Charity t = new Charity("1", "2");
        assertAll(
                () -> assertEquals(t.getCharityName(), "1"),
                () -> assertEquals(t.getGroupAcronym(), "2"),
                () -> assertNotNull(t)
        );
    }


    @Test
    void setCharityName() {
        Charity t = new Charity();
        t.setCharityName("123");
        assertEquals(t.getCharityName(), "123");
    }

    @Test
    void setCharityAcronym() {
        Charity t = new Charity();
        t.setCharityAcronym("123");
        assertEquals(t.getGroupAcronym(), "123");
    }

    @Test
    void addDonors() {
        Charity t = new Charity();
        t.addDonors("name", "town", 1.2);
        assertAll(
                () -> assertEquals(t.getIndex(), 1),
                () -> assertEquals(t.getDonorArray()[0].getCharityScale(),1.2)
        );

    }

    @Test
    void calculateTCharityScale() {
        Charity t = new Charity();
        t.addDonors("name", "town", 1.0);
        t.addDonors("name", "town", 2.0);
        assertEquals(t.calculateTCharityScale(), (2.0 + 1.0) / 2);
    }


    @Test
    void sort() {
        Charity t = new Charity();
        t.addDonors("name", "town", 3.0);
        t.addDonors("name", "town", 2.0);
        t.addDonors("name", "town", 1.0);
        t.sort();
        assertAll(
                () -> assertEquals(t.getDonorArray()[0].getCharityScale(),  1.0),
                () -> assertEquals(t.getDonorArray()[2].getCharityScale(),3.0)
        );
    }
}

