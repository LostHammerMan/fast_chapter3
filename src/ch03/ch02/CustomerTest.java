package ch03.ch02;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customerLee = new Customer(10010, "이순신");
        customerLee.bonusPoint = 1000;
        System.out.println(customerLee.showCustomerInfo());
        System.out.println("---------------------------------");

        VIPCustomer customerKim = new VIPCustomer(10020, "김좌진");
        customerKim.bonusPoint = 10000;
        System.out.println(customerKim.showCustomerInfo());
    }

}
