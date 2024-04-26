import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class jetTest{

    @Test
    void constructor1(){
        jet s = new jet("Mil",100);
        assertAll(
                () -> assertNotNull(s),
                () -> assertEquals(s.getCraftType(),"Mil"),
                () -> assertEquals(s.getCraftCost(),100)
        );
    }
    @Test
    void constructor2(){
        jet s = new jet("Mil","jet",100,2,5.5,.9);
        assertAll(
                () -> assertNotNull(s),
                () -> assertEquals(s.getCraftType(),"Mil"),
                () -> assertEquals(s.getFuelTank(),5.5),
                () -> assertEquals(s.getFuelUsed(),.9),
                () -> assertEquals(s.getJetCount(),2),
                () -> assertEquals(s.getPropulsionType(),"jet"),
                () -> assertEquals(s.getCraftCost(),100)
        );

    }
    @Test
    void setJetCount() {
        jet s = new jet("Mil",100);
        s.setJetCount(2);
        assertEquals(s.getJetCount(),2);
    }

    @Test
    void setFuelTank() {
        jet s = new jet("Mil",100);
        s.setFuelTank(2.2);
        assertEquals(s.getFuelTank(),2.2);
    }

    @Test
    void setFuelUsed() {
        jet s = new jet("Mil",100);
        s.setFuelUsed(2.2);
        assertEquals(s.getFuelUsed(),2.2);
    }

    @Test
    void testToString() {
        jet s = new jet("Mil",100);
        StringBuilder ss = new StringBuilder();
        ss.append("This Mil aircraft uses ramjet propulsion and costs $100.00\n");
        ss.append("Jet Count is not defined ");
        ss.append("The fuel size is not defined ");
        ss.append("Jet fuel is not defined ");
        jet l = new jet("Mil","jet",100,2,5.5,.9);
        StringBuilder ll = new StringBuilder();
        ll.append("This Mil aircraft uses jet propulsion and costs $100.00\n");
        ll.append("There are 2 jets on the jet ");
        ll.append("this jet can hold 5.5 gallons of fuel ");
        ll.append("There is 0.9% of fuel on the jet ");
        assertAll(
                ()-> assertEquals(s.toString(),ss.toString()),
                ()-> assertEquals(l.toString(),ll.toString())
        );
    }
}