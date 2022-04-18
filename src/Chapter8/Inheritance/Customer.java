package Chapter8.Inheritance;

public class Customer {
    protected int customerID;
    protected static int serialNum = 1000;
    protected String customerName;
    protected String customerGrade;
    protected int bonusPoint;
    protected double bonusRatio;

    public Customer(){
        serialNum++;
        customerID = serialNum;
        customerGrade = "SILVER";
        bonusPoint =0;
        bonusRatio =0.01;
    }

    public Customer(String customerName) {
        this.customerName = customerName;
    }

    public int calcPrice(int price){
        bonusPoint += price * bonusRatio;
        return price;
    }

    public void showCustomerInfo(){
        System.out.println(customerName+"님의 회원번호는 "+customerID+"이고 회원등급은 "+customerGrade+"이며, 현재 포인트는 "+bonusPoint+"원 입니다.");
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }

    public int getBonusPoint() {
        return bonusPoint;
    }

    public void setBonusPoint(int bonusPoint) {
        this.bonusPoint = bonusPoint;
    }

    public double getBonusRatio() {
        return bonusRatio;
    }

    public void setBonusRatio(double bonusRatio) {
        this.bonusRatio = bonusRatio;
    }
}
