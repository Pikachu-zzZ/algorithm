package com.example.code.listNodee;

import java.util.List;

public class e141 {
    public boolean hasCycle(ListNode head) {
        if(head == null){
            return false;
        }
        if(head.next == null){
            return false;
        }

        ListNode fast = head.next;
        ListNode slow = head;
        while(fast !=null && fast.next!=null){
            if(slow == fast){
                return true;
            }
            slow = slow.next;
            fast = fast.next.next;
        }

        return false;
    }
}
