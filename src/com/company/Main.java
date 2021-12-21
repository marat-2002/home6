package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Boss boss = new Boss();
        boss.setHealth(300);
        boss.setDamage(35);
        boss.weapon.setNameOfWeapon("Kinjal");
        boss.weapon.setTypeOfWeapon("Knife");
        System.out.println( boss.printInfo());

        Skeleton skeleton = new Skeleton();
        skeleton.setHealth(200);
        skeleton.setDamage(25);
        skeleton.setColStrike(12);
        skeleton.weapon.setNameOfWeapon("Luk");
        skeleton.weapon.setTypeOfWeapon("Almaz");

        Skeleton skeleton1 = new Skeleton();
        skeleton1.setHealth(150);
        skeleton1.setDamage(50);
        skeleton1.setColStrike(20);
        skeleton1.weapon.setNameOfWeapon("Luk");
        skeleton1.weapon.setTypeOfWeapon("Brilliant");
        System.out.println(skeleton.printInfo() + "\n" +  skeleton1.printInfo());
    }
}
