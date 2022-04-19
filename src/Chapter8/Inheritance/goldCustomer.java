package Chapter8.Inheritance;

public class goldCustomer extends Customer {
    private double saleRate;

    public goldCustomer(String customerName) {
        super(customerName);
        this.customerName = customerName;
        customerGrade = "GOLD";
        pointRate = 0.02;
        saleRate =0.1;
    }

    @Override
    public int calcPrice(int price) {;
        bonusPoint += price*pointRate;
        return price -= price*(int)saleRate;
    }

    @Override
    public String showCustomerInfo() {
        return super.showCustomerInfo();
    }
}