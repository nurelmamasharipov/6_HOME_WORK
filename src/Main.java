public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setDamage(55);
        boss.setHealth(1000);
        Weapon bossWeapon = new Weapon(WeaponType.SWORD, "Katana");
        boss.setWeapon(bossWeapon);

        Skeleton skeleton1 = new Skeleton();
        skeleton1.setDamage(25);
        skeleton1.setHealth(200);
        skeleton1.setArrows(20);
        Weapon skeletonWeapon1 = new Weapon(WeaponType.GUN, "M249 SAW");
        skeleton1.setWeapon(skeletonWeapon1);

        Skeleton skeleton2 = new Skeleton();
        skeleton2.setDamage(30);
        skeleton2.setHealth(230);
        skeleton2.setArrows(30);
        Weapon skeletonWeapon2 = new Weapon(WeaponType.BOW, "Death's BOW");
        skeleton2.setWeapon(skeletonWeapon2);

        boss.printInfo();
        skeleton1.printInfo();
        skeleton2.printInfo();
    }
}