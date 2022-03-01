package com.example.code.listNodee;

public class listNodeTest {


    public static void main(String[] args) {

        int[] nums = new int[]{1,1,2,3,3};

        ListNode head = new ListNode();
        ListNode list = head;
        for (int i = 0; i < nums.length; i++) {
            head.next = new ListNode(nums[i]);
            head = head.next;
        }
        System.out.println(list);

        //
        ListNode list1 = new ListNode(1);
        ListNode list2 = new ListNode(1);
        list1.next = new ListNode(2);
        list2.next = new ListNode(3);
        ListNode res = new e21().mergeTwoLists(list1, list2);
        System.out.println(res.toString());


        //ListNode node = new e83().deleteDuplicates(list);
        //System.out.println(node);

        ListNode listNode = new m82().deleteDuplicates(list);
        System.out.println(listNode);


    }
}
