package ch15;

public class BookShelfTest {

    public static void main(String[] args) {
        Queue bookQueue = new BookShelf();
        bookQueue.enQueue("해리포터 마법사의 돌1");
        bookQueue.enQueue("해리포터 마법사의 돌2");
        bookQueue.enQueue("해리포터 마법사의 돌3");
        bookQueue.enQueue("해리포터 마법사의 돌4");
        bookQueue.enQueue("해리포터 마법사의 돌5");

        System.out.println(bookQueue.getSize());

        System.out.println(bookQueue.deQueue());
        System.out.println(bookQueue.deQueue());
        System.out.println(bookQueue.deQueue());
        System.out.println(bookQueue.deQueue());
        System.out.println(bookQueue.deQueue());
    }
}
