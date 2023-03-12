package com.course.strings;

public class KomodoDragon {

    public int age;
    public double poison;
    public double attackSpeed;

    public KomodoDragon(int age, double poison, double attackSpeed) {
        this.age = age;
        this.poison = poison;
        this.attackSpeed = attackSpeed;
    }


    @Override
    public String toString() {
        return "Komodo Dragon -> Age : " + age + "; Poison : " + poison + "; Attack speed : " + attackSpeed /* + this */;
    }
}
