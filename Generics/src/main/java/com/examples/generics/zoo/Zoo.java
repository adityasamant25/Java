package com.examples.generics.zoo;

public class Zoo {
    public static void main(String[] args) {
        Cage<Monkey> cage = new Cage<>(new Monkey(), new Monkey());
        cage.setAnimal1(new Monkey());
        cage.setAnimal2(new Monkey());
        Monkey animal1 = cage.getAnimal1();
        System.out.println(animal1);

        Cage<Lion> lionCage = new Cage<>();
        lionCage.setAnimal1(new Lion());
        lionCage.setAnimal2(new Lion());

        Lion animal11 = lionCage.getAnimal1();
        System.out.println(animal11);
    }
}
