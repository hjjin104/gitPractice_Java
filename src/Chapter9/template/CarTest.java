package Chapter9.template;

public class CarTest {
    public static void main(String[] args) {
        Car car1 = new ManualCar();
        Car car2 = new AutoCar();

        car1.setStatus("맑음");
        car2.setStatus("비");

        System.out.println(car1.getStatus());
        System.out.println(car2.getStatus());
        System.out.println("");

        car1.moveCar();
        System.out.println("");
        car2.moveCar();
    }
}
