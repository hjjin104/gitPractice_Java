package Chapter9.gameLevel;

public class Player {
    protected PlayerLevel level;
    protected String direction;

    public Player(){
       level = new BeginnerLevel();
    }

    public PlayerLevel getLevel() {
        return level;
    }

    public void upgradeLevel(PlayerLevel level) {
        this.level = level;
        level.showLevelMessage();
    }

    public void play(int count, String direction) {
        this.direction = direction;
        level.go(count, direction);
    }

}
