package com.examples.lambda;

import java.util.function.BiConsumer;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        int[] someNumbers = {1, 2, 3, 4};
        int key = 0;

        process(someNumbers, key, wrapperLambda((n, k) -> System.out.println(n / k)));
    }

    private static void process(int[] someNumbers, int key, BiConsumer<Integer, Integer> biConsumer) {
        for (int n : someNumbers) {
            biConsumer.accept(n, key);
        }
    }

    private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> biConsumer) {
        return (v, k) -> {
            try {
                biConsumer.accept(v, k);
            } catch (ArithmeticException ae) {
                System.out.println("Exception caught in the wrapper lambda");
            }
        };
    }

}
