package Chapter8.Inheritance;

public class Test {
    public static void main(String[] args) {
        Customer customerJin = new Customer();
        customerJin.setCustomerName("Jin");
        customerJin.showCustomerInfo();

        Customer customerNicolas = new VipCustomer();
        customerNicolas.setCustomerName("Nicolas");
        customerNicolas.showCustomerInfo();

    }
}
