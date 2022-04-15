package Chapter2;

public class Student {
    int studentID;
    String studentName;

    Subject korean;
    Subject math;
    Subject eng;

//    public Student(){
//        korean = new Subject();
//        math = new Subject();
//    }
    public Student(int id, String name) {
        studentID = id;
        studentName = name;

        korean = new Subject("Korean");
        math = new Subject("Math");
        eng = new Subject("English");
    }

    public void showStudentInfo() {
        System.out.println(studentID + ": " + studentName);
    }


    public void setKorea( int score) {
        korean.setScore(score);
    }

    public void setMath(int score) {
        math.setScore(score);
    }

    public void showTotalScore() {
        int total = korean.getScore() + math.getScore();
        System.out.println(studentName + " 학생의 총점은 " + total + "점 입니다.");
    }
}
