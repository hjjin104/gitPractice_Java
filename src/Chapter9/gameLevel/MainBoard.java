package Chapter9.gameLevel;

public class MainBoard {
    public static void main(String[] args){
        Player player = new Player();
        player.play(1,"왼");
        System.out.println("");

        AdvancedLevel alevel = new AdvancedLevel();
        player.upgradeLevel(alevel);
        player.play(2,"오른");
        System.out.println("");

        SuperLevel slevel = new SuperLevel();
        player.upgradeLevel(slevel);
        player.play(13,"뒤");
    }
}