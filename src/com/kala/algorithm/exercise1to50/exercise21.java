package com.kala.algorithm.exercise1to50;

public class exercise21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode prelist = new ListNode(0);
        ListNode list = prelist;
        while (l1 != null && l2 != null) {
            if (l1.val >= l2.val) {
                list.next = l2;
                l2 = l2.next;
            } else {
                list.next = l1;
                l1 = l1.next;
            }
            list = list.next;
        }
        list.next = l1 == null ? l2 : l1;
        return prelist.next;
    }
}
