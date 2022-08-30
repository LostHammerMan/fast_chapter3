package ch02;

public class VIPCustomer extends Customer{

    // 이 멤버 변수들은 Customer를 상속받으므로 생략
//    private int customerId;
//    private String customerName;
//    private String customerGrade;
//    int bonusPoint;
//    double bonusRatio;

    private String agentId;
    double salesRatio;

    public VIPCustomer(){
        bonusRatio = 0.05;
        salesRatio = 0.1;
        customerGrade = "VIP";
    }

    public String getAgentId(){
        return agentId;
    }
}
