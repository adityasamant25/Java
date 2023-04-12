package com.examples.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Unit1Lambda {
    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 39)
        );

        //Step 1: Sort List by Last Name
        people.sort(Comparator.comparing(Person::getLastName));


        //Step 2: Create a method that prints all elements in the list
        performConditionally(people, p -> true, System.out::println);


        //Step 3: Create a method that prints all people that have last name beginning with C
        performConditionally(people, p -> p.getLastName().startsWith("C"), System.out::println);
    }

    private static void performConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
        for (Person p : people) {
            if (predicate.test(p)) {
                consumer.accept(p);
            }
        }
    }
}

