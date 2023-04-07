package com.examples.collections;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            names.add("name " + i);
        }

        for (String name : names) {
            System.out.println(name);
        }

    }
}
