package Chapter2;

public class StudentTest {

    public static void main(String[] args) {

        Student studentLee = new Student();
        studentLee.studentName ="이순신";
        studentLee.studentID = 100;
        studentLee.address ="Seocho-dong, Seocho-gu, Seoul";

        Student studentJin = new Student();
        studentJin.studentName ="Jin Hye Joo";
        studentJin.studentID = 150;
        studentJin.address ="Gangnam-dong, Gangnam-gu, Seoul";

        studentJin.showStudentInfo();
        studentLee.showStudentInfo();
    }
}
