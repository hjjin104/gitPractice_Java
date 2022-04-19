package Chapter9.abstractClass;

public class ComputerTest {
    public static void main(String[] args) {
        //Computer c1 = new Computer(); > abstract class이기 때문에 생성 불가
        Computer d1 = new DeskTop();
        //Computer l1 = new LapTop();
        Computer ml1 = new MyLapTop();

        d1.display();
        ml1.display();
    }
}
