package com.kala.company;

import com.kala.common.ListNode;

import java.util.ArrayList;


public class jz3printListFromTailToHead {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<>();

//        ListNode pre = new ListNode();
//        pre.next=listNode;
        ListNode temp = new ListNode();
        temp.next=listNode;
        temp=temp.next;
        System.out.println(temp);
        System.out.println(listNode);


        while (listNode!=null){
            list.add(0,listNode.val);
            listNode = listNode.next;
        }

        return list;
    }

    public static void main(String[] args) {
        ListNode l3 = new ListNode(3);
        ListNode l2 = new ListNode(2,l3);
        ListNode l1 = new ListNode(1,l2);
        jz3printListFromTailToHead jz3printListFromTailToHead = new jz3printListFromTailToHead();
        jz3printListFromTailToHead.printListFromTailToHead(l1);
    }
}
