package cooperation;

public class Bus {
    int busNum;
    int passengerCount;
    int money;

    public Bus(int busNum){
        this.busNum = busNum;
    }

    public void take(int money){
        passengerCount ++;
        this.money += money;
    }

    public void showBusInfo(){
        System.out.println(busNum+"번 버스의 승객은 "+passengerCount+"명이고, 총 수익은 "+money+"원입니다.");
    }
}
