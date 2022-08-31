package ch11;

public class CompleteCalc extends Calculator{
    @Override
    public int add(int num1, int num2) {
        return super.add(num1, num2);
    }

    @Override
    public int substract(int num1, int num2) {
        return super.substract(num1, num2);
    }

    @Override
    public int times(int num1, int num2) {
        return super.times(num1, num2);
    }

    @Override
    public int divide(int num1, int num2) {
        return super.divide(num1, num2);
    }

    public void showInfo(){
        System.out.println("모두 구현함");
    }
}
