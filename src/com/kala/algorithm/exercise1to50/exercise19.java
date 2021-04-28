package com.kala.algorithm.exercise1to50;

//Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class exercise19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode next = head;
        int length = 0;
        while (next != null) {
            length++;
            next = next.next;
        }
        int index = length - n;
        next = dummy;
        for (int i = 0; i < index; i++) {
            next = next.next;
        }
        next.next = next.next.next;
        return dummy.next;
    }
}
