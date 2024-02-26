public class Skeleton extends Boss{
    String name;
    private int numOfArrows;

    public Skeleton(String name, int health, int damage, int manaPool, Weapon weapon) {
        super(health, damage, manaPool, weapon);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumOfArrows() {
        return numOfArrows;
    }

    public void setNumOfArrows(int numOfArrows) {
        this.numOfArrows = numOfArrows;
    }

    public String printInfo() {
        return "Skeleton name: " + getName() + "\nSkeleton health: " + getHealth() + "\nSkeleton damage: " + getDamage() + "\nSkeleton manapool: " + getManaPool() + "\nSkeleton arrows: " + getNumOfArrows();
    }
}
