package Chapter9.gameLevel;

public abstract class PlayerLevel{
    public abstract void run();
    public abstract void jump(int count);
    public abstract void turn(String direction);
    public abstract void showLevelMessage();

    public final void go(int count, String direction){
        run();
        jump(count);
        turn(direction);
        showLevelMessage();
    }
}
