package Chapter2;

public class StudentTest {

    public static void main(String[] args) {
        Student studentNicolas = new Student(100, "Nicolas");
        studentNicolas.setKorean("Korean", 80);
        studentNicolas.setMath("Math", 70);
        studentNicolas.setEnglish("English",100);

        Student studentJin = new Student(101,"Jin");
        studentJin.setKorean("Korean", 100);
        studentJin.setMath("Math", 100);
        studentJin.setEnglish("English", 100);

        studentJin.showTotalScore();
    }
}
