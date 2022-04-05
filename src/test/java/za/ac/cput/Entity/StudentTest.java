package za.ac.cput.Entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
        student4 = new Student("Lito","Koopman",18);

    }
    //Test for object equality.
    @Test
    void testEquality() {
        assertEquals(student1, student3);
        assertNotEquals(student2, student4);
    }


}