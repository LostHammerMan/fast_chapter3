package ch15;

public class CustomerTest {
    public static void main(String[] args) {

        Customer customer = new Customer();
        customer.buy();
        customer.sell();
        customer.order();
        customer.hello();

        // 업캐스팅 -> 묵시적
        Buy buyer = customer;
        buyer.buy();
        buyer.order();

        // 인터페이스에 명시된 메서드만 사용 가능
        Sell sell = customer;
        sell.sell();
        sell.order(); // 재정의된 order 호출됨

    }
}
