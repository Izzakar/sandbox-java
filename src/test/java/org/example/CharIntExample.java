package org.example;


import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class CharIntExample {

     @Test
    public void test1() {
         char c= 'b';
         int index= c-'a';
         assertEquals(1, index);
    }

    @Test
    public void test2() {
        char c= 'b';
        int index= 'a';
        assertEquals(c, 98);
    }

}


