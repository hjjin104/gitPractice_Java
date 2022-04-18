package Chapter8.Inheritance;

public class Test {
    public static void main(String[] args) {
        Customer customerJin = new Customer();
        customerJin.setCustomerName("Jin");
        customerJin.showCustomerInfo();

        VipCustomer customerNicolas = new VipCustomer();
        customerNicolas.setCustomerName("Nicolas");
        customerNicolas.setBonusPoint(10000);
        customerNicolas.showCustomerInfo();

    }
}
