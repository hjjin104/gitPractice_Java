package Chapter9.gameLevel;

public class BeginnerLevel extends PlayerLevel{
    @Override
    public void run() {
        System.out.println("천천히 달립니다.");
    }

    @Override
    public void jump(int count) {
        System.out.println("jump 할 수 없습니다. 체력을 기르세요.");
    }

    @Override
    public void turn(String direction) {
        System.out.println("turn 할 수 없습니다. 기술을 배우세요.");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("현재 레벨은 Beginner Level입니다.");
    }
}
