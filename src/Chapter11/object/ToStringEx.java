package Chapter11.object;

class Book{
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return title+", "+ author;
    }
}

public class ToStringEx {
    public static void main(String[] args) {
        Book book = new Book("리타의 정원", "안리타");
        System.out.println(book);

        String str = new String("Test");
        System.out.println(str);

    }
}
