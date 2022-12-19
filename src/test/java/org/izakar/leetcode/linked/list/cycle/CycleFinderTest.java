package org.izakar.leetcode.linked.list.cycle;

import org.junit.Test;

import static org.junit.Assert.*;

public class CycleFinderTest {
    @Test
    public void empty_input_test() {
        CycleFinder cycleFinder = new CycleFinder();
        boolean result = cycleFinder.hasCycle(new ListNode(0, null));
        assertFalse(result);
    }

}