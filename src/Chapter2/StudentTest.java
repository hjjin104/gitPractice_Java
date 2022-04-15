package Chapter2;

public class StudentTest {

    public static void main(String[] args) {
        Student studentNicolas = new Student(100, "Nicolas");
        studentNicolas.setKorea(100);
        studentNicolas.setMath(60);

        Student studentJin = new Student(101, "Jin");
        studentJin.setKorea(100);
        studentJin.setMath(80);


        studentNicolas.showTotalScore();
        studentJin.showTotalScore();

        studentNicolas.showStudentInfo();
        studentJin.showStudentInfo();

    }
}
