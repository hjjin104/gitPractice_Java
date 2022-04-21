package Chapter9.template;

public class AutoCar extends Car{
    @Override
    public void drive() {
        System.out.println("자동차가 스스로 운전합니다.");
        System.out.println("자동차가 스스로 핸들을 조작합니다.");
    }

    @Override
    public void stop() {
        System.out.println("자동차가 스스로 브레이크를 밟습니다.");
        System.out.println("자동차가 스스로 멈춥니다.");
    }

    @Override
    public void wiper(String status) {
        if(status =="비"){
            System.out.println("비가 와 자동차가 스스로 와이퍼를 작동합니다.");
        }else if(status=="눈"){
            System.out.println("눈가 와 자동차가 스스로 와이퍼를 작동합니다.");
        }
        else{
            System.out.println("비나 눈이 오지 않아 와이퍼를 작동하지 않습니다.");
        }
    }
}
