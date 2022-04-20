package Chapter10.bookShelf;

public class bookShelfTest {
    public static void main(String[] args){
//        Queue shelfQueue = new bookShelf();
        bookShelf shelfQueue = new bookShelf();
        shelfQueue.enQueue("오늘은 이만 쉴게요");
        shelfQueue.enQueue("리타의 정원");
        shelfQueue.enQueue("몽카페");

        System.out.println(shelfQueue.getSize());
        System.out.println(shelfQueue.getShelf());
        System.out.println(shelfQueue.deQueue());
        System.out.println(shelfQueue.deQueue());
        System.out.println(shelfQueue.deQueue());
    }
}
