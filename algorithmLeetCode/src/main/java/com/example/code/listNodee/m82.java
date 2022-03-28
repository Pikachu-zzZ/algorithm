package com.example.code.listNodee;

import java.util.Stack;

/*
/链表的题通常需要注意两点：

1.舍得用变量，千万别想着节省变量，否则容易被逻辑绕晕
2. head 有可能需要改动时，先增加一个 假head，返回的时候直接取 假head.next，这样就不需要为修改 head 增加一大堆逻辑了。
 */
public class m82 {


    public ListNode deleteDuplicates(ListNode head) {


        if (head == null) {
            return head;
        }

        ListNode dummy = new ListNode(0, head);

        ListNode cur = dummy;
        while (cur.next != null && cur.next.next != null) {
            if (cur.next.val == cur.next.next.val) {
                int x = cur.next.val;
                while (cur.next != null && cur.next.val == x) {
                    cur.next = cur.next.next;
                }
            } else {
                cur = cur.next;
            }
        }

        return dummy.next;
    }
}
