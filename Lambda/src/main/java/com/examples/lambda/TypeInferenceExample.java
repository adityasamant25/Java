package com.examples.lambda;

public class TypeInferenceExample {
    public static void main(String[] args) {
        printLambda(String::length);
    }

    public static void printLambda(StringLengthLambda l) {
        System.out.println(l.getLength("Hello world!"));
    }

    interface StringLengthLambda {
        int getLength(String s);
    }
}
