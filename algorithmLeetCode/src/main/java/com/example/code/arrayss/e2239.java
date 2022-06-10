package com.example.code.arrayss;

public class e2239 {
    public int findClosestNumber(int[] nums) {
        int res = 0;
        int min = Integer.MAX_VALUE;
        for (int x: nums
             ) {
            if(Math.abs(x) < min){
                min = Math.abs(x);
                res = x;
            }else if(Math.abs(x) == min){
                res = Math.max(res,x);
            }
        }

        return res;
    }
}
