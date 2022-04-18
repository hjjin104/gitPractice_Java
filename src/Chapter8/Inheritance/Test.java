package Chapter8.Inheritance;

public class Test {
    public static void main(String[] args) {
        Customer customerJin = new Customer("Jin");
        int price = customerJin.calcPrice(10000);
        System.out.println("지불 금액은 "+price+"입니다. "+ customerJin.showCustomerInfo());

        VipCustomer customerNicolas = new VipCustomer("Nicolas", 100);
        customerNicolas.setBonusPoint(10000);
        price = customerNicolas.calcPrice(20000);
        System.out.println("지불 금액은 "+price+"입니다. "+customerNicolas.showCustomerInfo());

        goldCustomer customerKim = new goldCustomer("Kim");
        int priceG = customerKim.calcPrice(15000);
        System.out.println("지불 금액은 "+priceG+"입니다. "+customerKim.showCustomerInfo());
    }
}
