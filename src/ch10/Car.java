package ch10;

public abstract class Car {

    public abstract void drive();
    public abstract void stop();
    public abstract void wiper();

    public void startCar(){
        System.out.println("시동을 켭니다.");
    }

    public void turnOff(){
        System.out.println("시동을 끕니다.");
    }

    // 추상 메서드 아님, body 있으나 구현안함 --> 하위 클래스에서 재정의
   public void washCar(){}


    // 시나리오 - 변하면 안됨 -> final
    public final void run(){
        startCar();
        drive();
        stop();
        turnOff();
        washCar();
    }
}
