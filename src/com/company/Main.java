package com.company;

public class Main {

    public static void main(String[] args) {
        Hero heroes[] = {new Mage(),new Warrior(),new Medic()};
        for (int i = 0; i < heroes.length; i++) {
            System.out.println(heroes[i].abilityType());
        }
    }
}
