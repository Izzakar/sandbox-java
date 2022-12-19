package org.example;

import org.example.modificators.SomeClass;
import org.junit.Test;

public class ModificatorsTest {

    @Test
    public void test()
    {
        SomeClass someClass = new SomeClass();
        someClass.incapsulatedLogic();
    }
}
