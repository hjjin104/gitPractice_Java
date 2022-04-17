package Chapter7;

public class ObjectCopy {
    public static void main(String[] args) {
        Book[] bookArr1 = new Book[3];
        Book[] bookArr2 = new Book[3];

        bookArr1[0] = new Book("리타의 정원", "안리타");
        bookArr1[1] = new Book("자바 프로그래밍 입문", "박은종");
        bookArr1[2] = new Book("나의 문화유산 답사기", "유홍준");

        System.arraycopy(bookArr1, 0,bookArr2,0,3);

        for(int i=0; i< bookArr1.length; i++){
            bookArr1[i].showBookInfo();
            bookArr2[i].showBookInfo();
            System.out.println("");
        }
//        bookArr1[0] = new Book("해를 품은 달","정은궐");

        bookArr1[0].setBookName("해를 품은 달");
        bookArr1[0].setAuthor("정은궐");

        for(int i=0; i< bookArr1.length; i++){
            bookArr1[i].showBookInfo();
            bookArr2[i].showBookInfo();
            System.out.println("");
        }

    }
}
