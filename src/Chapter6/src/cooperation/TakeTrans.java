package Chapter6.src.cooperation;

public class TakeTrans {
    public static void main(String[] args){
        Student s1 = new Student("Jin", 6000);
        Student s2 = new Student("Nicolas", 10000);

        Bus bus1 = new Bus(100);
        Subway subway1 = new Subway(1);

        s2.takeSubway(subway1);
        s2.showInfo();
        subway1.showSubwayInfo();
    }
}
