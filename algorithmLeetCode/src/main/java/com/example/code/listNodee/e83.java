package com.example.code.listNodee;

public class e83 {
    public ListNode deleteDuplicates(ListNode head) {

        // 写链表题，每一题必须要写
        if (head == null) {
            return head;
        }
        ListNode dummy = new ListNode();
        dummy.next = head;

        while (head.next!=null){
            if(head.next.val == head.val){
                head.next = head.next.next;
            }else {
                head = head.next;
            }


        }


        return dummy.next;
    }
}
