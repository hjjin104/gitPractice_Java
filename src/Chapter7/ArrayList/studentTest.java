package Chapter7.ArrayList;

public class studentTest {
    public static void main(String[] args) {

        Student s1 = new Student("Jin");
        s1.addSubject("국어", 100);
        s1.addSubject("수학", 100);
        s1.addSubject("영어", 100);
        s1.showStudentScoreInfo();
        s1.showStudentInfo();
        System.out.println("");

        Student s2 = new Student("Nicolas");
        s2.addSubject("국어", 60);
        s2.addSubject("수학", 70);
        s2.addSubject("영어", 100);
        s2.showStudentInfo();
        s2.showStudentScoreInfo();


    }
}
