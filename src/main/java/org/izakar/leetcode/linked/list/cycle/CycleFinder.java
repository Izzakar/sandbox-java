package org.izakar.leetcode.linked.list.cycle;

public class CycleFinder {
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }

        ListNode tortoise = head;
        ListNode hare = head.next;

        while (tortoise != null && hare != null) {
            System.out.println(hare.val);
            if (tortoise == hare) {
                return true;
            }
            if (hare.next == null) {
                return false;
            }

            tortoise = tortoise.next;
            hare = hare.next.next;

        }

        return false;
    }
}
