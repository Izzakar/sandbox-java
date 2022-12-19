package org.izakar.array.list.node.convert;

import org.izakar.leetcode.linked.list.cycle.ListNode;

public class LeetCodeListNodeConverter {
    public ListNode convert(int [] array) {

        if (array.length == 0){

            return null;
        }

        ListNode current = new ListNode(array[array.length-1], null);

        for (int i= array.length-2; i>=0; i--){

            current = new ListNode(array[i], current);

        }
                return current;
    }
}
