package com.example.code.arrayss;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

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



    @Test
    public void m6043Test(){

    }



    @Test
    public void e88Test(){
        int[] nums1 = new int[]{0};
        int m = 0;
        int[] nums2 = new int[]{1};
        int n = 1;
        new e88().merge(nums1,m,nums2,n);

    }




    @Test
    public void m417Test(){

        int[][] heights = {{1,2,3,4},{12,13,14,5},{11,16,15,6},{10,9,8,7}};

        List<List<Integer>> lists = new m417().pacificAtlantic(heights);
    }

}
