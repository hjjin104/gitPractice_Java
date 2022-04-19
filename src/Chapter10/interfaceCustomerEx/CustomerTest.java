package Chapter10.interfaceCustomerEx;

public class CustomerTest {
    public static void main(String[] args){
        Customer customer = new Customer();

        Buy buyCustomer = customer; // customer1은 Buy라는 interface를 갖고 있기 때문에 재정의 가능
        buyCustomer.buy();

        Sell sellCustomer = customer;
        sellCustomer.sell();

        customer.order();
        sellCustomer.order(); //Type이 Sell이지만 형태는 Customer, 기능은 Customer에 있는 것만 사용 가능
        buyCustomer.order();
        System.out.println("");
    }
}
