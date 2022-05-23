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

    /**
     * Takes a random amount of damage and sets p's health to its health minus the damage.
     * <p>
     * Returns true if the attack was successful or not; false otherwise.
     *
     * @param p a Player object
     *
     * @return if the attack was successful
     */
    public boolean attack(Player p) {
        if (p != null) {
            int dmg = (int) (Math.random() * 41) + 10; // from 10 to 50
            p.setHealth(p.getHealth() - dmg);
            return true;
        }
        return false;
    }
}