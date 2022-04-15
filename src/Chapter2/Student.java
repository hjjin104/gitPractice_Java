package Chapter2;

public class Student {
    int studentID;
    String studentName;

    Subject korean;
    Subject math;
    Subject english;


    public Student(int id, String name) { //생성자가 생성할 때 new로 설정해주면 각 과목에 대한 인스터스 생성
        studentID = id;
        studentName = name;
        korean = new Subject();
        math = new Subject();
        english = new Subject();
    }

    public void setKorean(String name, int score) {
        korean.setSubjectName(name);
        korean.setSubjectScore(score);
    }

    public void setMath(String name, int score) {
        math.setSubjectName(name);
        math.setSubjectScore(score);
    }

    public void setEnglish(String name, int score) {
        english.setSubjectName(name);
        english.setSubjectScore(score);
    }

    public void showTotalScore() {
        int total = korean.getSubjectScore() + math.getSubjectScore() + english.getSubjectScore();
        System.out.println(studentName + "학생의 총점은 " + total + "점 입니다.");
    }
}
