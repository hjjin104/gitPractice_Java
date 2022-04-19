package Chapter8.Inheritance;

import Chapter7.Array;

import java.util.ArrayList;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customerJin = new Customer("Jin");
        Customer customerLee = new Customer("Lee");
        goldCustomer customerKim = new goldCustomer("Kim");
        VipCustomer customerNicolas = new VipCustomer("Nicolas",100);
        VipCustomer customerChoi = new VipCustomer("Choi",101);

        ArrayList<Customer> customerList = new ArrayList<>();
        customerList.add(customerJin);
        customerList.add(customerLee);
        customerList.add(customerKim);
        customerList.add(customerNicolas);
        customerList.add(customerChoi);

        System.out.println("===== 고객 정보 출력 =====");
        for(Customer customer: customerList){
            System.out.println(customer.showCustomerInfo());
        }

        System.out.println("===== 할인율 및 지불 금액 출력 =====");
        for(Customer customer: customerList){
            int cost = customer.calcPrice(10000);
            System.out.println(customer.getCustomerName()+"님이 지불하신 금액은 "+cost+"원이며 보너스 포인트는 "+ customer.getBonusPoint()+"원입니다.");
        }

    }
}
