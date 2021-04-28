package com.kala.algorithm.exercise1to50;

public class exercise24 {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode temp = dummy;

        while (dummy.next != null && dummy.next.next != null) {
            ListNode node1 = dummy.next;
            ListNode node2 = dummy.next.next;
            dummy.next = node2;
            node1.next = node2.next;
            node2.next = node1;
            dummy = node1;
        }
        return temp.next;
    }
}
