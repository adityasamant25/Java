package com.examples.lambda;

public class Greeter {
    public static void main(String[] args) {
        Greeter greeter = new Greeter();

        //Lambda
        Greeting lambdaGreeting = () -> System.out.println("Hello world!");
        greeter.greet(lambdaGreeting);

        //Anonymous Inner Class
        Greeting innerClassGreeting = new Greeting() {
            @Override
            public void perform() {
                System.out.println("Hello world!");
            }
        };
        greeter.greet(innerClassGreeting);
    }

    public void greet(Greeting greeting) {
        greeting.perform();
    }
}
