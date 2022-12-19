package org.izakar.array.list.node.convert;

import org.izakar.leetcode.linked.list.cycle.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class LeetCodeListNodeConverterTest {

    @Test
    public void empty(){
        LeetCodeListNodeConverter converter = new LeetCodeListNodeConverter();
        ListNode listNode = converter.convert(new int [0]);
        assertEquals(null,listNode);
    }

    @Test
    public void one_element(){
        LeetCodeListNodeConverter converter = new LeetCodeListNodeConverter();
        ListNode listNode = converter.convert(new int []{1});
        assertEquals(new ListNode(1,null),listNode);
    }

    @Test
    public void two_element(){
        LeetCodeListNodeConverter converter = new LeetCodeListNodeConverter();
        ListNode pointer = converter.convert(new int []{1,2});
        ListNode listNode = new ListNode(1, new ListNode(2, null));

        while (pointer!=null) {

            System.out.println(pointer.val);
            System.out.println(listNode.val);

            assertEquals(listNode, pointer);

            pointer = pointer.next;
            listNode = listNode.next;

        }
    }


}