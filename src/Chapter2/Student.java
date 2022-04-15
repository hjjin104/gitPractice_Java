package Chapter2;

public class Student {
        int studentID;
        String studentName;
        int koreaScore;
        int mathScore;
        int engScore;

        public void showStudentInfo(){
            System.out.println(studentID+":"+studentName+","+address);
        }

        public String getStudentName(){
            return studentName;
        }

        public void setStudentName(String name){
            studentName=name;
        }

}
