package ch10;

public class ManualCar extends Car{
    @Override
    public void drive() {
        System.out.println("사람이 운전");
        System.out.println("사람이 핸들 조작");
    }

    @Override
    public void stop() {
        System.out.println("클러치 오류, 시동을 종료합니다");
    }

    @Override
    public void wiper() {

    }

    @Override
    public void washCar() {
        System.out.println("세차 개같은거");
    }
}
