package staticEx;

public class StudentId {
    static int serialNum = 10000;
    int studentId;
    String studentName;

    public StudentId(){
        serialNum++;
        studentId = serialNum;
    }
}
