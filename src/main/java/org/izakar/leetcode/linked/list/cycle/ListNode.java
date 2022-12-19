package org.izakar.leetcode.linked.list.cycle;

import java.util.Objects;

public class ListNode {
      public int val;
      public ListNode next;
      public ListNode(int x,ListNode nextNode) {
          val = x;
          next = nextNode;
      }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListNode listNode = (ListNode) o;
        return val == listNode.val;
    }

    @Override
    public int hashCode() {
        return Objects.hash(val);
    }
}