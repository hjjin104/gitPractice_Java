package Chapter8.Inheritance;

public class VipCustomer extends Customer {
    private double saleRate;
    private int agentId;

    public VipCustomer(String customerName, int agentId){
        super(customerName);
        this.customerName=customerName;
        customerGrade="VIP";
        pointRate = 0.05;
        saleRate = 0.1;
        this.agentId=agentId;
    }

    public int calcPrice(int price){
        price -= price*saleRate;
        bonusPoint += price*pointRate;
        return price;
    }

    @Override
    public String showCustomerInfo() {
        return super.showCustomerInfo()+" "+ customerName+"님의 담당상담 직원은 "+agentId+"번 입니다.";
    }

    public int getAgentId(){
        return agentId;
    }
}