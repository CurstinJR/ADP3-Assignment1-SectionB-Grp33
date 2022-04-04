/* This is my section B Test Entity
 Kevin Lionel Mombo Ndinga (218180500)
4th Of April 2022
 */
package za.ac.cput.Entity;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WorldTest {
    @Test
    public void testFailing() {
        fail("Hello Everyone ");
    }
    @Test
    public void testEquality(){
        String Str1 = "Russia";
        String Str2 = "Russia";
        assertEquals(Str1, Str2);
    }
    @Test
    public void testIdentity(){
        String obj3 = "England";
        String obj4 = "England";
        assertSame(obj3, obj4);
    }
    @Test
    @Disabled("I am from Gabon ")
    public void disabledTest(){
        int a = 145;
        int b = 200;
        int sum = a + b;
        System.out.println("The Sum of a + b = " +sum);

    }


}
