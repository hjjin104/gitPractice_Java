package Chapter8.Inheritance;

public class VipCustomer extends Customer {
    private double saleRate;
    private int agentId;

    public VipCustomer(String customerName){
        super(customerName);
        this.customerName=customerName;
        customerGrade="VIP";
        pointRate = 0.05;
        saleRate = 0.1;
    }

    public int getAgentId(){
        return agentId;
    }
}