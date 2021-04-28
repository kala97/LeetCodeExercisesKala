package com.kala.algorithm.company;

import com.kala.common.ListNode;

public class jz15ReverseList {
    public ListNode ReverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur;
        ListNode nex;
        cur = head;
        while (cur!=null){
            nex = cur.next;
            cur.next = pre;
            pre = cur;
            cur = nex;
        }
        return pre;
    }
}
