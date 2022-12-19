package org.example;


import org.junit.Test;

import java.util.ArrayDeque;

import static org.junit.Assert.assertEquals;

public class DequeExample {
    @Test
    public void peek_test() {
        ArrayDeque<String> animals = new ArrayDeque<>();
        animals.add("cat");
        animals.add("dog");
        assertEquals("cat", animals.pop());
    }
    @Test
    public void remove_test() {
        ArrayDeque<String> animals = new ArrayDeque<>();
        animals.add("cat");
        animals.add("dog");
        System.out.println(animals);
        assertEquals("cat", animals.removeFirst());
    }
}

