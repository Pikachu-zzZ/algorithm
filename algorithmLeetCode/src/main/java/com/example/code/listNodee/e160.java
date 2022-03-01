package com.example.code.listNodee;

public class e160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        //首先判断链表是不是为空
        if (headA == null || headB == null) {
            return null;
        }

        ListNode lA = headA;
        ListNode lB = headB;
        while(lA != lB){

            if(lA!=null){
                lA = lA.next;
            }else {
                lA = headB;

            }
            if(lB!=null){
                lB = lB.next;
            }else {
                lB = headA;

            }

        }

        return lA;
    }
}
