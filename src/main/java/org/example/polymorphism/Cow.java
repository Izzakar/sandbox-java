package org.example.polymorphism;

public class Cow implements Animal {
    @Override
    public void produceSound() {
        System.out.println("moo!");
    }
}
