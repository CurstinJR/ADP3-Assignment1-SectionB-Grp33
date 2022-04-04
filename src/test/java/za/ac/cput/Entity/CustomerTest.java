package za.ac.cput.Entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest
{
    private Customer customerA;
    private Customer customerB;

    @BeforeEach
    void setUp()
    {
        customerA = new Customer(1L,
                "Quinn",
                "Frost",
                "quinn@email.com",
                "quinn@123");
        customerB = new Customer(2L,
                "Curstin",
                "Rose",
                "curstin@email.com",
                "curstin@123");
    }

    @Test
    public void objectIdentityTest_shouldBeSameObjects()
    {
        customerB = customerA;
        assertSame(customerA, customerB);
    }

    @Test
    public void objectIdentityTest_shouldNotBeSameObjects()
    {
        assertNotSame(customerA, customerB);
    }

    @Test
    public void objectEqualityTest_shouldEqualObjects()
    {
        customerB = customerA;
        assertEquals(customerA, customerB);
    }

    @Test
    public void objectEqualityTest_shouldNotEqualObjects()
    {
        assertNotEquals(customerA, customerB);
    }
}