package ch06;

public class Customer {

    //
    protected int customerId; // protected : 하위 클래스는 접근 가능, 외부 클래스는 접근 불가
    protected String customerName;
    protected String customerGrade;
    int bonusPoint;
    double bonusRatio;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
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

//    public Customer(){
//        customerGrade = "SILVER";
//        bonusRatio = 0.01;
//
//        System.out.println("Customer() called.............");
//    }

    public Customer(int customerId, String customerName){
        this.customerId = customerId;
        this.customerName = customerName;

        System.out.println("Customer() called.............");
    }

    public int calcPrice(int price){
        bonusPoint += price * bonusRatio;
        return price;
    }

    public String showCustomerInfo(){
        return customerName + " 님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.";
    }
}
