package org.example;


import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

public class SetExample {
    @Test
    public void test() {
        Set<String> newSet = new HashSet<>();
        newSet.add("dog");
        assertFalse(newSet.add("dog"));
    }

    @Test
    public void negation_test() {
        Set<String> newSet = new HashSet<>();
        newSet.add("dog");
        assertTrue(!newSet.add("dog"));
    }

}


