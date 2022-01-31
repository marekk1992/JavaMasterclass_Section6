package learning.constructors;

public class Main {

    public static void main(String[] args) {

        BankAccount my = new BankAccount(12345, 0.00, "Bob Brown",
                "my@udemy.com", "+307 623 158 78");
        my.deposit(12.45);
        my.withdrawal(11.45);

        BankAccount timsAccount = new BankAccount("Tim", "tim@email.com", "12354");
        System.out.println(timsAccount.getAccountNumber() + " name " + timsAccount.getName());

        VipCustomer customer1 = new VipCustomer("Mark", "mark@udemy.com");
        System.out.println("Customer name is " + customer1.getCustomerName() + ", customers email is " + customer1.getCustomerEmail());
        System.out.println(customer1.getCreditLimit());
    }
}
