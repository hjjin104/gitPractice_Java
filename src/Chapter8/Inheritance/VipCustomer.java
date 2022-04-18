package Chapter8.Inheritance;

public class VipCustomer extends Customer {
    protected int bonusPoint;
    protected double bonusRatio;

    private int agentID;
    private double saleRatio;

    public VipCustomer() {
        customerGrade = "VIP"; //Class에서 변수를 private이라고 선언하면 extends해도 사용할 수 없다(외부 클래스에서 사용할 수 없음) 따라서 protected로 변수 설정!
        bonusPoint = 0;
        bonusRatio = 0.05;
        saleRatio =0.1;
    }

    public int getAgentID(){
        return agentID;
    }
//    public VipCustomer(int customerID, String customerName) {
//        this.customerID = customerID;
//        this.customerName = customerName;
//        customerGrade = "VIP";
//        bonusPoint = 0;
//        bonusRatio = 0.05;
//    }
}