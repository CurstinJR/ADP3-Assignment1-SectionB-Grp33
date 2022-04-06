/* This is my section B Test Entity
 Kevin Lionel Mombo Ndinga (218180500)
4th Of April 2022
 */
package za.ac.cput.Entity;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class WorldTest {
    @Test
    public void testFailing() {
        fail("Hello Everyone,this method will fail ");
    }
    @Test
    public void testEquality(){
        String Str1 = new String ("Russia");
        String Str2 = new String ("Russia");
        assertEquals(Str1, Str2);
    }
    @Test
    public void testIdentity(){
        String obj3 = "England";
        String obj4 = "England";
        assertSame(obj3, obj4);
    }
    @Disabled("I am disabled this method ")
    @Test
    public void disabledTest(){
        int a = 145;
        int b = 200;
        int sum = a + b;
        System.out.println("The Sum of a + b = " +sum);

    }

    @Test
    @Timeout(value = 500, unit = TimeUnit.MILLISECONDS)
    void timeoutTest() {
        double kilometerWestSide = 152.02;
        double c = 200.50;
        double sum = kilometerWestSide * c;
        System.out.println("ANSWER: "+sum);
    }

}
