package Chapter7.ArrayList;

public class studentTest {
    public static void main(String[] args) {

        Student s1 = new Student("Jin", 1001);
        s1.addSubject("국어", 100);
        s1.addSubject("수학", 100);
        s1.addSubject("영어", 100);
        s1.showStudentInfo();

        Student s2 = new Student("Nicolas", 1002);
        s2.addSubject("국어", 60);
        s2.addSubject("수학", 70);
        s2.addSubject("영어", 100);
        s2.showStudentInfo();


    }
}
