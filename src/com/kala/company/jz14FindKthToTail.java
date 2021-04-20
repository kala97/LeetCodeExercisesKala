package com.kala.company;

import com.kala.common.ListNode;

public class jz14FindKthToTail {
    public ListNode FindKthToTail(ListNode pHead, int k) {
        // write code here
        ListNode first = pHead;
        ListNode last = pHead;
        for (int i = 0; i < k; i++) {
            if (first==null) return first;
            first = first.next;
        }
        while (first!=null){
            first = first.next;
            last = last.next;
        }
        return last;
    }

    public static void main(String[] args) {
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(2, a1);
        ListNode a3 = new ListNode(3, a2);
        ListNode a4 = new ListNode(4, a3);
        ListNode a5 = new ListNode(5, a4);

//        ListNode y = a5;
//        ListNode x = y;
//        ListNode x1;
//        x1 = a5;
//        x = x.next;
//        x1 = x1.next;
//        System.out.println(x == y);



    }
}
