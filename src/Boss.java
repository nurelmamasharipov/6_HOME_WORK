public class Boss extends GameEntity{
    private Weapon weapon;

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void printInfo() {
        System.out.println("Boss damage: " + getDamage() + " | Boss health: " + getHealth() +
                " | Weapon: " + weapon.getName() + " (" + weapon.getType() + ")");
    }
}
