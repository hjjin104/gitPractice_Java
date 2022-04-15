package cooperation;

public class Student {
    String studentName;
    int money;

    public Student(String studentName, int money){
        this.studentName = studentName;
        this.money = money;
    }

    public void takeBus(Bus bus){
        bus.take(1000);
        money -= 1000;
    }

    public void takeSubway(Subway subway){
        subway.take(1000);
        money -= 1000;
    }

    public void showInfo(){
        System.out.println(studentName +"학생의 잔돈은 "+money+"원입니다.");
    }
}
