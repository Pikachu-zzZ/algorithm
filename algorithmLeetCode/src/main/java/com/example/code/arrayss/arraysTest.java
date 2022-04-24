package com.example.code.arrayss;

import org.junit.Test;

import java.util.Arrays;

public class arraysTest {
    public static void main(String[] args) {
        int[] nums = new int[]{0,0,1};
        int val = 0;
        int res = new e27().removeElement1(nums,val);
        System.out.println(res);
        System.out.println(Arrays.toString(nums));

    }



    @Test
    public void m6071Teat(){
        int[] ints = {2,2,3};
        int i = new m6071().minimumRounds(ints);
        System.out.println(i);
    }
}
