package org.example.java.sandbox.equals.hascode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;

public class DynamicBindingTest {
    @Test
    public void test_a(){
        Parent parent = new Parent();
        int foo = parent.foo();
        assertEquals(1,foo);

    }

    @Test
    public void test_b() {
        Parent parent = new Child();
        int foo = parent.foo();
        assertEquals(2, foo);
    }

    @Test
    public void test_c() {

        Parent parent;

        if (new Random().nextBoolean()) {
            parent = new Parent();
            int foo = parent.foo();
            assertEquals(1, foo);
        }
        else {
            parent = new Child();
            int foo = parent.foo();
            assertEquals(2, foo);
        }

    }

}