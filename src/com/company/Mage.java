package com.company;

public class Mage extends Hero {
    public Mage(int hP, int damage) {
        this.hP = hP;
        this.damage = damage;
    }

    public Mage() {
    }

    @Override
    public void applyAbility() {
        System.out.println();
    }

    @Override
    public String abilityType() {
        return "Mage summons a pack of wolves";
    }
}
