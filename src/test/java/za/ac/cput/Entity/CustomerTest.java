package za.ac.cput.Entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.List;

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

    @Test
    @Timeout(1)
    public void timeoutTest_pass()
    {
        Customer [] arr = new Customer[2];

        arr[0] = customerA;
        arr[1] = customerA;

        for (Customer customer : arr)
        {
            System.out.println(customer);
        }
    }

    @Test
    public void boundToFail_fail()
    {
        customerB = customerA;

        if (customerA.equals(customerB))
        {
            fail("customer A should not equal to Customer B");
        }
        else
        {
            System.out.println("Customer A does not equal to Customer B");
        }
    }

    @Test
    @Disabled("Test not ready")
    public void disabledTest_ignored()
    {
        List<Customer> numbers = List.of(customerA, customerB);
        numbers.forEach(System.out::println);
    }
}