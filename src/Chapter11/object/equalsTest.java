package Chapter11.object;

class Book1{
    String title;
    String author;

    Book1(String title, String author){
        this.title = title;
        this.author = author;
    }
}

class Student {
    String studentName;
    int studentID;

    Student(String studentName, int studentID) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            Student student = (Student) obj;
            if (studentID == student.studentID)
                return true;
            else
                return false;
        }
        System.out.println("비교하고자 하는 두 클래스의 타입이 다릅니다.");
        return false;
    }
}

public class equalsTest {
    public static void main(String[] args) {
        String str1 = new String("Test");
        String str2 = new String("Test");
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
        System.out.println();

        Student student1 = new Student("Jin", 1001);
        Student student2 = new Student("Nicolas", 1002);
        Student student3 = new Student("Jin",1001);

        Book1 book = new Book1("리타의 정원", "안리타");


        System.out.println(student1 == student2);
        System.out.println(student1.equals(student2));
        System.out.println(student1.equals(student3));
        System.out.println(student1.equals(book));


    }
}
