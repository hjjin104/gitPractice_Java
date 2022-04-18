package Chapter8.Inheritance;

public class goldCustomer extends Customer {
    private double saleRate;

    public goldCustomer(String customerName) {
        super(customerName);
        this.customerName = customerName;
        customerGrade = "Gold";
        pointRate = 0.05;
    }

    @Override
    public int calcPrice(int price) {
        this.price = price * (int)pointRate;
        bonusPoint += price*pointRate;
        return price;
    }
}