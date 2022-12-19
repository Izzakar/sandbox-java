package org.example;

import org.example.polymorphism.Animal;
import org.example.polymorphism.Cow;
import org.example.polymorphism.Dog;
import org.junit.Test;

public class PolymorphismExampleTest {

    @Test
    public void test()
    {
        Animal animal = new Cow();
        animal.produceSound();
    }
}
