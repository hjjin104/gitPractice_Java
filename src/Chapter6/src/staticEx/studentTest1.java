package Chapter6.src.staticEx;

public class studentTest1 {
    public static void main(String[] args){
        StudentId s1 = new StudentId();
        System.out.println(s1.studentId);

        StudentId s2 = new StudentId();
        System.out.println(s2.studentId);

        System.out.println(StudentId.serialNum);
    }
}
