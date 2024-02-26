public class Boss extends GameEntity {
    protected Weapon weapon;

    public Boss(int health, int damage, int manaPool, Weapon weapon) {
        super(health, damage, manaPool);
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public String printInfo(){
        return "Boss health: " + getHealth() + "\nBoss damage: " + getDamage() + "\nBoss manapool: " + getManaPool() + "\nBoss weapon: "  + weapon.getWeaponType() + " " + weapon.getWeaponName();

    }
}
