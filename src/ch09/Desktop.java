package ch09;

public  class Desktop extends Computer{ // 추상 메서드를 모두 구현하더라도 추상 클래스로 선언 가능 -> 단, 인스턴스화 불가
    @Override
    public void display() {
        System.out.println("Desktop display");
    }

    @Override
    public void typing() {
        System.out.println("Desktop Typing");
    }

    @Override
    void turnOn() {
        System.out.println("Desktop turnOn");

    }

    @Override
    void turnOff() {
        System.out.println("Desktop turnOff");

    }
}
