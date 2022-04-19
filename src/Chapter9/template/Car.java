package Chapter9.template;

public abstract class Car {
    protected String status;

    public abstract void drive();

    public abstract void stop();

    public void startCar() {
        System.out.println("시동을 겁니다.");
    }

    public void stopCar() {
        System.out.println("시동을 끕니다.");
    }

    public void wiper(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public final void moveCar() {
        startCar();
        drive();
        wiper(status);
        stop();
        stopCar();
    }
}