package Chapter7.ArrayList;

import java.util.ArrayList;

public class Student {
    private String studentName;
    private int studentID;
    private ArrayList<subject> subjectList;

    public Student(String studentName, int studentID) {
        this.studentName = studentName;
        this.studentID = studentID;

        subjectList = new ArrayList<subject>();
    }

    public void addSubject(String name, int score) {
        subject subject1 = new subject();
        subject1.setSubjectName(name);
        subject1.setScorePoint(score);

        subjectList.add(subject1);
    }

    public void showStudentInfo() {
        int total = 0;
        for (subject s : subjectList) {

            total += s.getScorePoint();
            System.out.println("학생 " + studentName + "님의 수강과목 " + s.getSubjectName() + "의 점수는 " + s.getScorePoint() + "점 입니다.");
        }
        System.out.println("학생 " + studentName + "님의 총점은 " + total + "점 입니다.");
    }


}
