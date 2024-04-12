import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestExample {
    /**
     Junit test methods always have @Test above the method header
     You should test all methods except ones that print data.
     Methods that print data to the monitor or a text file are tested
     by running the code (unit testing print methods is more difficult
     and outside the scope of this course).

     You must use an assert to actually make a test, the more commonly used tests are:

     assertNotNull - tests an Object to see if it has a memory location
     assertNotNull(Object, message if needed);
     assertTrue - you must make a boolean expression (usually with
     comparator operators E.G < > <= >= == !=)
     assertTrue(Boolean Expression, message if needed);
     assertEquals - you give it an expected value and get the actual value
     assertEquals(expected value, actual value, message if needed
     assertAll - can be used in conjunction with any of the above asserts
     to test methods with multiple parameter list variables
     assertAll(message,
     () -> assert/s - multiple asserts are separated by comma's
     ); assertAll close
     */

    @Test
    void testExample(){
        /**
         1. instantiate the Object you are testing
         2. use the variable to call methods (if needed)
         3. assert (test) the values or Object
         */
    }


    @Test
    void anotherExample() {
        /**    assertAll("test message",
         () -> assertEquals(expected value, actual value, message if needed),
         () -> assertNotNull(Object, message if needed),
         () -> assertTrue(Boolean Expression, message if needed)
         // any combination of asserts can be used in an assertAll
         // the parenthesis () and arrow -> are an anonymous function
         // (a function without a name).
         // notice the comma's after the first two asserts,
         // but there is not one after the last assert.
         ); // This is the close of the assertAll */
    }
}