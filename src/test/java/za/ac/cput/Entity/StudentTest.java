package za.ac.cput.Entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    private Student student1;
    private Student student2;
    private Student student3;
    private Student student4;


    @BeforeEach
    void setUp() {
        student1 = new Student("lyle","Adams",17);
        student2 = new Student("Armin","Appolish",15);
        student3 = student1;
        student4 = new Student("Armin","Koopman",18);

    }
    //Test for object equality.
    @Test
    void testEquality() {
        assertEquals(student1, student3);
        assertNotEquals(student2, student4);
    }

    //Test for object identity.
    @Test
    void testIdentity() {
        assertSame(student1, student3);
        assertNotSame(student1, student2);
    }

    //Failing test
    @Test
    void failingTest() {
        String stud1 = student1.getStudentName();
        String stud2 = student2.getStudentName();
        assertEquals(stud1, stud2);
        fail("Forcing the test to fail");
    }

    //Timeout test
    @Test
    @Timeout(value = 1000, unit = TimeUnit.MILLISECONDS)
    void timeoutTest() {
        String stud3 = student2.getStudentName();
        String stud4 = student4.getStudentName();
        assertEquals(stud3, stud4);
    }

    //Disabling test
    @Disabled("Disabling the test method")
    @Test
    void disablingTest() {
        assertEquals(student1, student2);
    }

}