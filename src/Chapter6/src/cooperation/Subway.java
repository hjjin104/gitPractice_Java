package Chapter6.src.cooperation;

public class Subway {
    int lineNum;
    int passengerCount;
    int money;

    public Subway(int lineNum){
        this.lineNum = lineNum;
    }

    public void take(int money){
        this.money += money;
        passengerCount++;
    }

    public void showSubwayInfo(){
        System.out.println(lineNum+"호선의 승객 수는 "+passengerCount+"명이고 총 수익은 "+money+"원입니다");
    }
}
