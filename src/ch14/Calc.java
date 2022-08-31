package ch14;

public interface Calc {

    double PI = 3.14;
    int ERROR = -99999;

    int add(int num1, int num2);
    int substract(int num1, int num2);
    int times(int num1, int num2);
    int divide(int num1, int num2);

    // 디폴트 메서드
    default void description(){
        System.out.println("정수의 사칙연산 제공함.....");
        myMethod();

    }

    static int total(int[] arr){

        int total = 0;
        for (int num : arr){
            total += num;
        }
        myStaticMethod();
        return total;
    }

// private method 는 재정의 불가
    private void myMethod(){
        System.out.println("myMethod...");
    }

    // static method : 인터페이스 내부에서 사용
    private static void myStaticMethod(){
        System.out.println("myStaticMethod........");
    }

}
