public class Main {
    public static void main(String[] args) {
        Weapon bossWeapon = new Weapon();
        bossWeapon.setWeaponName("Elven Bow");
        bossWeapon.setWeaponType(WeaponType.BOW);
        Boss boss = new Boss(700, 30, 100, bossWeapon);
        boss.setWeapon(bossWeapon);
        System.out.println(boss.printInfo());

        Weapon firstSkeletonWeapon = new Weapon();
        firstSkeletonWeapon.setWeaponName("Excalibur");
        firstSkeletonWeapon.setWeaponType(WeaponType.SWORD);
        Skeleton firstSkeleton = new Skeleton("Skeleton Clinkz",500, 20, 0, firstSkeletonWeapon);
        firstSkeleton.setNumOfArrows(10);
        System.out.println(firstSkeleton.printInfo());

        Weapon secondSkeletonWeapon = new Weapon();
        secondSkeletonWeapon.setWeaponName("Spear of Destiny");
        secondSkeletonWeapon.setWeaponType(WeaponType.SPEAR);
        Skeleton secondSkeleton = new Skeleton("Skeleton Bonnie",400, 40, 0, secondSkeletonWeapon);
        secondSkeleton.setNumOfArrows(15);
        System.out.println(secondSkeleton.printInfo());


    }
}