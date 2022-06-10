package com.example.code.arrayss;

import java.util.ArrayList;
import java.util.Stack;

public class m1823 {
    public int findTheWinner(int n, int k) {
        if(k == 1){
            return n;
        }

        if(n == 1){
            return n;
        }

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        for (int i = 1; i <=n ; i++) {
            list1.add(i);
        }
        int count = 1;
        int list1Idx = 0;
        while (list1.size()!=1){
            int len = list1.size();
            if(count < k){
                list2.add(list1.get(list1Idx));
                count++;
                list1Idx++;
            }else {
                count = 1;
                list1Idx++;

            }
            if (list1Idx == len){
                list1Idx = 0;
                list1 = new ArrayList<>(list2);
                list2 = new ArrayList<>();
            }



        }

        return list1.get(0);


    }


    public static void main(String[] args) {
        int theWinner = new m1823().findTheWinner(5, 2);
        System.out.println(theWinner);



    }
}
