package Chapter9.gameLevel;

public class AdvancedLevel extends PlayerLevel{
    @Override
    public void run() {
        System.out.println("천천히 달립니다.");
    }

    @Override
    public void jump(int count) {
        System.out.println("점프를 "+count+"번 합니다.");
    }

    @Override
    public void turn(String direction) {
        System.out.println("turn 할 수 없습니다. 기술을 배우세요.");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("현재 레벨은 Advanced Level입니다.");
    }
}
