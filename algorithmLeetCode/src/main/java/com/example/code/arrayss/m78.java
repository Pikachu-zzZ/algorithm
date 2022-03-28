package com.example.code.arrayss;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class m78 {


//     经典全排列
    public List<List<Integer>> subsets(int[] nums) {
        ArrayList<List<Integer>> lists = new ArrayList<>();

        for (int i = 0; i < 8; i+=2) {
            System.out.println(i);
        }



        Stack<Integer> integers = new Stack<>();
        Integer push = integers.push(1);
        System.out.println(push);
        boolean add = integers.add(2);
        System.out.println(integers.add(2));


        return lists;
    }


    public static void main(String[] args) {
        List<List<Integer>> subsets = new m78().subsets(new int[]{1, 2, 3});
    }

}
