package Chapter7.ArrayList;

import Chapter2.Subject;

import java.util.ArrayList;

public class Student {
    private String studentName;
    private int studentID;
    static int serialNum = 1000; // static 변수는 모든 class가 공유하는 변수
    private ArrayList<subject> subjectList;

    public Student(String studentName) {
        this.studentName = studentName;
        serialNum++;
        studentID = serialNum;
        this.studentID = studentID;

        subjectList = new ArrayList<subject>();
    }

    public void addSubject(String name, int score) {
        subject subject1 = new subject();
        subject1.setSubjectName(name);
        subject1.setScorePoint(score);

        subjectList.add(subject1);
    }

    public void showStudentScoreInfo() {
        int total = 0;
        for (subject s : subjectList) {

            total += s.getScorePoint();
            System.out.println("학생 " + studentName + "님의 수강과목 " + s.getSubjectName() + "의 점수는 " + s.getScorePoint() + "점 입니다.");
        }
        System.out.println("학생 " + studentName + "님의 총점은 " + total + "점 입니다.");
    }

    public void showStudentInfo() {
        System.out.println(studentName + ", " + studentID);
    }

    public void showStudentAvg() {
        int sizeOfArrayList = subjectList.size();
        int sum = 0;
        for (subject c: subjectList) {
            sum += c.getScorePoint();
        }
        int avg = sum/sizeOfArrayList;
        System.out.println(studentName+"학생의 평균 점수는 "+avg+"입니다.");
    }
}

