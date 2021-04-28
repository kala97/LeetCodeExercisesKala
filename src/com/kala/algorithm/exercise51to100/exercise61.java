package com.kala.algorithm.exercise51to100;

import com.kala.algorithm.common.ListNode;

public class exercise61 {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null||k == 0) return head;
        ListNode backup = new ListNode(0,head);
        int length = 1;
        while (head.next!=null){
            length++;
            head = head.next;
        }
        int advance = k%length;
        ListNode newhead = backup.next;
        head.next = newhead;
        for (int i = 0; i < length-advance-1; i++) {
            newhead = newhead.next;
        }
        head = newhead.next;
        newhead.next = null;
        return head;
    }
}
