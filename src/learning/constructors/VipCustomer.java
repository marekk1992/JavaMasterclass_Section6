package learning.constructors;

public class VipCustomer {

    private String customerName;
    private double creditLimit;
    private String customerEmail;

    public VipCustomer() {
        this("Default customer name", 10000.00, "Default customer email");
    }

    public VipCustomer(String customerName, String customerEmail) {
        this(customerName, 35000.00, customerEmail);
    }

    public VipCustomer(String customerName, double creditLimit, String customerEmail) {
        this.customerName = customerName;
        this.creditLimit = creditLimit;
        this.customerEmail = customerEmail;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }
}
