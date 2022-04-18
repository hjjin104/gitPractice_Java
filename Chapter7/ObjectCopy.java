package Chapter7;

public class ObjectCopy {
    public static void main(String[] args) {
        Book[] bookArr1 = new Book[3];
        Book[] bookArr2 = new Book[3];

        bookArr1[0] = new Book("리타의 정원", "안리타");
        bookArr1[1] = new Book("자바 프로그래밍 입문", "박은종");
        bookArr1[2] = new Book("나의 문화유산 답사기", "유홍준");

        bookArr2[0] = new Book(); //깊은 복사, 즉 주소값(데이터가 저장되는 공간)이 아닌 멤버변수 자체를 복사하고 싶으면 객체 생성을 먼저 해야함
        bookArr2[1] = new Book();
        bookArr2[2] = new Book();

        //System.arraycopy(bookArr1, 0,bookArr2,0,3); 깊은 복사를 하기 위해서는 arraycopy 매서드를 사용하면 안됨

        for(int i=0; i< bookArr1.length; i++){
            bookArr2[i].setBookName(bookArr1[i].getBookName());
            bookArr2[i].setAuthor(bookArr1[i].getAuthor());
            bookArr1[i].showBookInfo();
            bookArr2[i].showBookInfo();
            System.out.println("");
        }
        System.out.println("");
//        bookArr1[0] = new Book("해를 품은 달","정은궐"); > 새로운 인스턴스 설정, 수정하고 싶으면 set 매서드 사용

        bookArr1[0].setBookName("해를 품은 달");
        bookArr1[0].setAuthor("정은궐");

        for(int i=0; i< bookArr1.length; i++){
            bookArr1[i].showBookInfo();
            bookArr2[i].showBookInfo();
            System.out.println("");
        }

    }
}
