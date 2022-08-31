package ch09;

public abstract class NoteBook extends Computer{ // Computer의 모든 추상 메서드를 구현하지 않으면 abstract 클래스로 선언

    @Override
    public void display() {
        System.out.println("NoteBook Display....");
    }
}
