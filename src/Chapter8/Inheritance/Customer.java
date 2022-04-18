package Chapter8.Inheritance;

public class Customer {

    protected String customerName;
    protected int customerID;
    protected static int serialnumber =1000;
    protected String customerGrade;
    int bonusPoint;
    protected double pointRate;

//    public Customer(){
//        serialnumber++;
//        customerID= serialnumber;
//        customerGrade = "SILVER";
//        bonusPoint = 0;
//        pointRate = 0.1;
//    }

    public Customer(String customerName){
        this.customerName=customerName;
        serialnumber++;
        customerID=serialnumber;
        customerGrade="SILVER";
        bonusPoint=0;
        pointRate=0.1;
    }


    public void showCustomerInfo(){
        System.out.println(customerName+"님의 회원번호는 "+customerID+"이고 회원등급은 "+customerGrade+"입니다. " +
                customerName+"님의 포인트는 "+bonusPoint+"원입니다.");
    }
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
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

    public double getPointRate() {
        return pointRate;
    }

    public void setPointRate(double pointRate) {
        this.pointRate = pointRate;
    }

    public int getPoint(int price){
        bonusPoint += price*pointRate;
        return price;
    }
}
