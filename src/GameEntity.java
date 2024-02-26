public class GameEntity {
    private int health;
    private int damage;
    private int manaPool;

    public GameEntity(int health, int damage, int manaPool) {
        this.health = health;
        this.damage = damage;
        this.manaPool = manaPool;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getManaPool() {
        return manaPool;
    }

    public void setManaPool(int manaPool) {
        this.manaPool = manaPool;
    }
}
