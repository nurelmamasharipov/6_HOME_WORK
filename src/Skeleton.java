public class Skeleton extends Boss{
    private int arrows;

    public int getArrows() {
        return arrows;
    }

    public void setArrows(int arrows) {
        this.arrows = arrows;
    }

    public void printInfo() {
        System.out.println("Skeleton damage: " + getDamage() + " | Skeleton health: " + getHealth() +
                " | Weapon: " + getWeapon().getName() + " (" + getWeapon().getType() + ")" +
                " | Arrows: " + arrows);
    }
}
