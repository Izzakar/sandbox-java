package org.example.polymorphism;

public class Dog implements Animal {
    @Override
    public void produceSound() {
        System.out.println("bark!");
    }
}
