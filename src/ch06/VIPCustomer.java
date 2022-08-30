package ch06;

public class VIPCustomer extends Customer {

    // 이 멤버 변수들은 Customer를 상속받으므로 생략
//    private int customerId;
//    private String customerName;
//    private String customerGrade;
//    int bonusPoint;
//    double bonusRatio;

    private String agentId;
    double salesRatio;

    public VIPCustomer(int customerId, String customerName) {
        super(customerId, customerName);

        customerGrade = "VIP";
        bonusRatio = 0.05;
        salesRatio = 0.1;
        System.out.println("VIPCustomer called.............");
    }

//    public VIPCustomer(){
//        super(); // 1 하위 클래스가 상위 클래스의 인스턴스의 참조값을 가짐 , 2 상위 클래스의 생성자 가리킴
//                  // 생성자가 없는 경우 컴파일러가 자동으로 추가해줌(default constructor의 경우)
//        bonusRatio = 0.05;
//        salesRatio = 0.1;
//        customerGrade = "VIP";
//
//        System.out.println("VIPCustomer called.............");
//    }

    public String getAgentId(){
        
        return agentId;
    }
}
