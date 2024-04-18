import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DonorTest {

    @Test
    void donor() {
        Donor test = new Donor();
        assertAll(
                ()->assertEquals(test.getDonorName(),""),
                ()->assertEquals(test.getHomeTown(),""),
                ()->assertEquals(test.getCharityScale(),0.0),
                ()->assertNotNull(test)
        );
    }
    @Test
    void fullDonor() {
        Donor test = new Donor("1","2",3.0);
        assertAll(
                ()->assertEquals(test.getHomeTown(),"1"),
                ()->assertEquals(test.getDonorName(),"2"),
                ()->assertEquals(test.getCharityScale(),3.0),
                ()->assertNotNull(test)
        );
    }

    @Test
    void setDonorName() {
        Donor test = new Donor();
        test.setDonorName("5");
        assertEquals(test.getDonorName(),"5");
    }

    @Test
    void setHomeTown() {
        Donor test = new Donor();
        test.setHomeTown("5");
        assertEquals(test.getHomeTown(),"5");
    }

    @Test
    void setCharityScale() {
        Donor test = new Donor();
        test.setCharityScale(5.0);
        assertEquals(test.getCharityScale(),5.0);
    }

    @Test
    void testToString() {
        Donor test = new Donor();
        assertEquals(test.toString(),String.format("Name: %-22s  Hometown: %-18s  Charity Scale: %.2f%%", "", "", 0.0));
    }
}