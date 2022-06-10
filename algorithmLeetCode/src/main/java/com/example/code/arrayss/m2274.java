package com.example.code.arrayss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class m2274 {
    public int maxConsecutive(int bottom, int top, int[] special) {
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(special);
        list.add(bottom);
        for (int x: special
             ) {
            if(x-1 > bottom) list.add(x-1);
            if(x+1 < top) list.add(x+1);
        }
        list.add(top);
        Collections.sort(list);
        int max = 0;
        for (int i = 0; i < list.size()-1; i++) {
            if(list.get(i+1)- list.get(i)>1){
                max = Math.max(max,list.get(i+1)- list.get(i)+1);}
        }
        System.out.println(list);
        return max;
    }


    public static void main(String[] args) {

        int bottom = 6;
        int top = 8;
        int[] special = new int[]{7,6,8};
        int i = new m2274().maxConsecutive(bottom, top, special);
        System.out.println(i);
    }
}
