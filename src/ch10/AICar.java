package ch10;

public class AICar extends Car{
    @Override
    public void drive() {
        System.out.println("자율주행 ㄱㄱㄱ");
        System.out.println("자동차가 스스로 방향을 정합니다");
    }

    @Override
    public void stop() {
        System.out.println("운전을 종료합니다...");
    }

    @Override
    public void wiper() {

    }

    @Override
    public void washCar() {
        System.out.println("자동 세차 합니다");
    }
}
