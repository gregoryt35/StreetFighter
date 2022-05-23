public class Player {

    private String name;
    private int health;

    public Player(String n) {
        name = n;
        health = 100;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int h) {
        health = h;
    }
}