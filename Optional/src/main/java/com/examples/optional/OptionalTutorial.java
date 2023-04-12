package com.examples.optional;

import java.util.Optional;

public class OptionalTutorial {
    public static void main(String[] args) {
        Optional<Cat> optionalCat = findCatByName();
        System.out.println(optionalCat.map(Cat::getAge).orElse(0));
    }

    private static Optional<Cat> findCatByName () {
        Cat cat = new Cat("Fred", 3);
        return Optional.of(cat);
    }
}
