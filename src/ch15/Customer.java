package ch15;

public class Customer implements Buy,Sell{
    @Override
    public void buy() {
        System.out.println("Customer Buy.....");
    }

    @Override
    public void order() {
        System.out.println("Customer Order.....");
    }

    @Override
    public void sell() {
        System.out.println("Custoemr sell.....");
    }

    public void hello(){
        System.out.println("hello");
    }
}
