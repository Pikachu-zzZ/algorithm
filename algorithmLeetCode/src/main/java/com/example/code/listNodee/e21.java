package com.example.code.listNodee;

public class e21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head1 = list1;
        ListNode head2 = list2;
        ListNode res = new ListNode(0);
        ListNode temp = res;

        while(head1!=null && head2!=null){

            if(head1.val <= head2.val){
                temp.next = head1;
                temp = temp.next;
                head1 = head1.next;
            }else {
                temp.next = head2;
                temp = temp.next;
                head2 = head2.next;
            }
        }

        if(head1 == null){
            temp.next = head2;
        }


        if(head2 == null){
            temp.next = head1;
        }


        return res.next;
    }
}
