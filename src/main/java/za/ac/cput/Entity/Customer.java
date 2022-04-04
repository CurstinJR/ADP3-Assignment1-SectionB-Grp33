package za.ac.cput.Entity;

public class Customer
{
    private Long customerId;
    private String customerFirstName;
    private String customerLastName;
    private String customerEmail;
    private String customerPassword;

    public Customer()
    {
    }

    public Customer(Long customerId, String customerFirstName, String customerLastName,
                    String customerEmail, String customerPassword)
    {
        this.customerId = customerId;
        this.customerFirstName = customerFirstName;
        this.customerLastName = customerLastName;
        this.customerEmail = customerEmail;
        this.customerPassword = customerPassword;
    }

    public Long getCustomerId()
    {
        return customerId;
    }

    public void setCustomerId(Long customerId)
    {
        this.customerId = customerId;
    }

    public String getCustomerFirstName()
    {
        return customerFirstName;
    }

    public void setCustomerFirstName(String customerFirstName)
    {
        this.customerFirstName = customerFirstName;
    }

    public String getCustomerLastName()
    {
        return customerLastName;
    }

    public void setCustomerLastName(String customerLastName)
    {
        this.customerLastName = customerLastName;
    }

    public String getCustomerEmail()
    {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail)
    {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPassword()
    {
        return customerPassword;
    }

    public void setCustomerPassword(String customerPassword)
    {
        this.customerPassword = customerPassword;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof Customer customer)) return false;

        if (getCustomerId() != null ?
                !getCustomerId().equals(customer.getCustomerId()) :
                customer.getCustomerId() != null)
            return false;
        if (getCustomerFirstName() != null ?
                !getCustomerFirstName().equals(customer.getCustomerFirstName()) :
                customer.getCustomerFirstName() != null)
            return false;
        if (getCustomerLastName() != null ?
                !getCustomerLastName().equals(customer.getCustomerLastName()) :
                customer.getCustomerLastName() != null)
            return false;
        if (getCustomerEmail() != null ?
                !getCustomerEmail().equals(customer.getCustomerEmail()) :
                customer.getCustomerEmail() != null)
            return false;
        return getCustomerPassword() != null ?
                getCustomerPassword().equals(customer.getCustomerPassword()) :
                customer.getCustomerPassword() == null;
    }

    @Override
    public int hashCode()
    {
        int result = getCustomerId() != null ? getCustomerId().hashCode() : 0;
        result = 31 * result + (getCustomerFirstName() != null ? getCustomerFirstName().hashCode() : 0);
        result = 31 * result + (getCustomerLastName() != null ? getCustomerLastName().hashCode() : 0);
        result = 31 * result + (getCustomerEmail() != null ? getCustomerEmail().hashCode() : 0);
        result = 31 * result + (getCustomerPassword() != null ? getCustomerPassword().hashCode() : 0);
        return result;
    }

    @Override
    public String toString()
    {
        return "Customer{" +
                "customerId=" + customerId +
                ", customerFirstName='" + customerFirstName + '\'' +
                ", customerLastName='" + customerLastName + '\'' +
                ", customerEmail='" + customerEmail + '\'' +
                ", customerPassword='" + customerPassword + '\'' +
                '}';
    }
}
